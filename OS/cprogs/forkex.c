#include<stdio.h>
#include <sys/types.h>
#include <unistd.h>


void main()
{
	fork();
	fork();
	fork();
	printf("pid=%d ppid=%d \n",getpid(),getppid());
}
