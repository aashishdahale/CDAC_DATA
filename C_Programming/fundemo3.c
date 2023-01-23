#include<stdio.h>


//function which does not return anything
// as it is void
void add(int,int);
void main()
{
	int num1,num2;
	printf("\nEnter two number :");
	scanf("%d%d",&num1,&num2);
	add(num1,num2);
	
}
void add(int num1,int num2)
{
	int sum;
	sum=num1+num2;
	printf("Addition is :%d",sum);
	
}
