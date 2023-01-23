#include<stdio.h>
#include <sys/types.h>
#include <unistd.h>


void main()
{
	int childpid;
	childpid = fork();
	if( childpid > 0 )
	{
		printf("hi I am parent %d\n",getpid());
	}
	else
	{
	printf("hi I am child %d\n",getpid());
	}
}



