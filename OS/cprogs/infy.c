#include<stdio.h>
#include <sys/types.h>
#include <unistd.h>


void main()
{
	while(1)
   printf("hi pid=%d ppid=%d\n",getpid(),getppid());
}
