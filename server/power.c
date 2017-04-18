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
    int number;
    int power;
    
    number = atoi(argv[1]);
    power = atoi(argv[2]);
    int result=1;
    if(power<0){
        float buf=1;
        for(int i=0;i>power;i--){
            buf/=number;
        }
        printf("%f\n",buf);
    }
    else{
    for(int i=0;i<power;i++)
        result*=number;
    printf("%d\n",result);
    }
    return 0;
}
