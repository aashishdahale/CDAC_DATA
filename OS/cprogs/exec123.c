#include<stdio.h>
#include<unistd.h>


void main()
{
   char *args1[] = {"/bin/ls", "-la", "/home", NULL};
    char *args2[] = {"ls", "-la", "/home", NULL};
    
	printf("hello ..%d",getpid());
	
	//execl("/bin/ls","/bin/ls","-l","/",NULL);
	//execlp("ls","ls","-l","/home",NULL);
	//execv("/bin/ls", args1);
	execvp("ls", args2);
	
	
}


