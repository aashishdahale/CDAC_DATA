#include<stdio.h>
 #include <sys/types.h>
       #include <signal.h>

  

  
void main()
{
	int pid;
	printf("enter a pid to terminate\n");
	scanf("%d",&pid);
	kill(pid,SIGTERM);
	

    
  
}




