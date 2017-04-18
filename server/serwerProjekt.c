#include <sys/types.h>
#include <sys/wait.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <signal.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

char** procedureNames;
int procedureSize;

void childSlayer(int sign)
{
	wait(NULL);
}

void endOfServer(int sign)
{
	int i;
	for(i = 0; i < procedureSize; i++)
	{
		free(procedureNames[i]);
	}
	free(procedureNames);
    exit(0);
}

void sendProcedureList(int clientFD)
{
    
	//char pom[2];
    char pom;
    //itoa(procedureSize);
	sprintf(&pom, "%d", procedureSize);
	write(clientFD, &pom, 1);
	//write(clientFD, &pom[1], 1);
    int i, j;
	for(i = 0; i < procedureSize; i++)
	{
        for(j = 0; j < strlen(procedureNames[i]); j++)
        {
            write(clientFD, &procedureNames[i][j], 1);
        }
        char endline = '\n';
        write(clientFD, &endline, 1);
	}
}

void serverLoading()
{
    
	//loading procedure list, in first line must be number of procedures
	FILE* fileFD = fopen("procedureNames.txt", "r");
    if(fileFD==NULL){
        printf("Brak pliku z nazwami procedur");
        exit(0);
    }
	char* number[2];
	
    size_t len;
    getline(number, &len, fileFD);
	procedureSize = atoi(number[0]);
	procedureNames = malloc(procedureSize);
	int i;
	for(i = 0; i < procedureSize; i++)
	{
		procedureNames[i] = malloc(40); // procedure name must not be longer than 40 characters
	}

	
	// wczytywanie nazw procedur
	i = 0;
    
	while(getline(&procedureNames[i], &len, fileFD) > 0)
	{
        int j=0;
        while(procedureNames[i][j]!='\n')
        {
            j++;
        }
        procedureNames[i][j]='\0';
        i++;
	}
	fclose(fileFD);
}



void clientServicing(int clientFD)
{
    int procedureNumber;

	sendProcedureList(clientFD);
    
	while(1)
	{
        char option;
		char number=0;
        
		read(clientFD, &option, 1);
        printf("%d\n",option);
        char numberOfArguments;
		int numberOfArgumentsInt;

		// read number - send description
		if(option == '0')
		{
            
            read(clientFD, &number, 1);
          //  printf("%d\n",number);
            procedureNumber = number - '0';
            char tab[100];
            strcpy(tab, procedureNames[procedureNumber]);
			FILE* fileFD = fopen(strcat(tab, ".txt"), "r");
            if(fileFD==NULL){
                printf("Brak wskazanej funkcji na serwerze\n");
                exit(0);
            }
            char x;

            numberOfArguments = fgetc(fileFD);
            
            write(clientFD, &numberOfArguments, 1);
			numberOfArgumentsInt = numberOfArguments - 48;
			int xint;
            while((xint = fgetc(fileFD)) != EOF)
            {
                x = xint;
				write(clientFD, &x, 1);
			}
			fclose(fileFD);
		}
		// read arguments - execute procedure and send result
		else if (option == '1')
		{
			//read arguments
			char *argumenty[numberOfArgumentsInt + 2];            
            int i;
			for(i = 0; i < numberOfArgumentsInt + 1; i++)
			{
                
                char character;
                char word[20];
                int j = 0;
                while(1)
                {
                    read(clientFD, &character, 1);
                    if(character != 10)
                    {
                        word[j] = character;
                        j++;
                    }
                        else break;
            }                
            argumenty[i] = strdup(word);
            }
            argumenty[numberOfArgumentsInt+2]=NULL;
			
			printf("ARUGMENTS\n");
			for(int i = 0; i < numberOfArgumentsInt+2; i++)
            {
                printf("%s\n", argumenty[i]);
                
            }
            
            int pipeFD[2];
            pipe(pipeFD);
			
            if(fork() == 0){
                close(pipeFD[0]);
                dup2(pipeFD[1], 1);
                int check = execv(argumenty[0], argumenty);
                
                perror("error");
                if(check != 0) exit(0);
            }
            else{   
                close(pipeFD[1]);
                
                char end='\n';
                char wynik;
    
                int check;
                wait(&check);
                
                printf("RESULT\n");
                while(read(pipeFD[0],&wynik, sizeof(wynik)) > 0)
                {
                    printf("%c\n", wynik);
                    write(clientFD, &wynik, 1);
                }
                write(clientFD,&end,1);
                close(pipeFD[0]);
            }
		}
	}
}

int main()
{
	// loading database - procedure names
	serverLoading();

	// launching server
	int serverFD = socket(PF_INET, SOCK_STREAM, 0);
	int on = 1;
	setsockopt(serverFD, SOL_SOCKET, SO_REUSEADDR, (char*)&on, sizeof(on));

	signal(SIGCHLD, childSlayer);
	signal(SIGINT, endOfServer);

	struct sockaddr_in serverAddr, clientAddr;
	socklen_t clientSize;
	serverAddr.sin_family = PF_INET;
	serverAddr.sin_port = htons(1025);
	serverAddr.sin_addr.s_addr = INADDR_ANY;
	bind(serverFD, (struct sockaddr*)&serverAddr, sizeof(serverAddr));
	listen(serverFD, 2);

	// server main loop
	while(1) // receiving and servicing new clients
	{
		clientSize = sizeof(clientAddr);
		int clientFD = accept(serverFD, (struct sockaddr*)&clientAddr, &clientSize);
		if(fork() == 0)
		{
			close(serverFD);
			printf("new connection: %s\n", inet_ntoa((struct in_addr)clientAddr.sin_addr));
			clientServicing(clientFD);
			close(clientFD);
		}
		close(clientFD);
	}
	close(serverFD);

	return 0;
}
