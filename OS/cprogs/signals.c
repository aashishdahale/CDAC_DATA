#include<stdio.h>
#include<signal.h>
  
// Handler for SIGINT, caused by
// Ctrl-C at keyboard
void handle_sigint(int sig)
{
    printf("Caught signal %d\n", sig);
}
  
void main()
{
    signal(SIGKILL, handle_sigint);
    printf("main running...\n");
    while (1) ;
  
}





