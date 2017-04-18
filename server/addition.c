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

int main(int argc, char* argv[]){

    int number1;
    int number2;
    
    number1 = atoi(argv[1]);
    number2 = atoi(argv[2]);
    int result = number1 + number2;
    printf("%d\n",result);
    return 0;
}
