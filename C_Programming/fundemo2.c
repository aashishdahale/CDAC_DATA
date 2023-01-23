#include<stdio.h>

//Function declaration

//void printMessage(int); //only datatype
//Function Defintion
void printMessage(int num)
{
	
	int i;
	for(i=1;i<=num;i++)
	{
		printf("Hello World!!!\n");
	}
}


void main()
{
	int n;
	//Function call
	printf("\nEnter number :");
	scanf("%d",&n);
	//printMessage(5);
	printMessage(n);
}










