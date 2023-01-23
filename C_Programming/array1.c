#include<stdio.h>
void sqr(int, int);
void main()
{
	int num1,num2,square;
	printf("enter two numbers to multiply\n");
	scanf("%d %d",&num1,&num2);
	sqr(num1,num2);
}
void sqr(int n1, int n2)
{
	int square;
	square=n1*n2;
	printf("%d\n",square);
}
