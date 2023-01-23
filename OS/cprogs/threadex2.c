#include<stdio.h>
#include <pthread.h>
//to compile this code
//use gcc -o te2 threadex2.c -lpthread

void  editor()
{
	int i;
	for(i=0;i<=10;i++){
	  printf("editor running..\n");
	  sleep(2);
	  }
}

void  spellchecker()
{
	int i;
	for(i=0;i<=10;i++){
	  printf("spellchecker running..\n");
	  sleep(2);
	  }
}

void main()
{
   pthread_t  th1, th2 ,th3;
   
   pthread_create(&th1, NULL ,editor , NULL);
   pthread_create(&th2, NULL,spellchecker, NULL );
     pthread_create(&th3, NULL ,editor , NULL);
	//while(1);
	
   pthread_join(th1,NULL);
   printf("main ends \n");	
}









