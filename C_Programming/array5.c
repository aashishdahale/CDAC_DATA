#include<stdio.h>
void check(int);
void prime(int);
void main()
{
	int n;
	printf("enter a number\n");
	scanf("%d",&n);
	check(n);
}

	void check(int a)
	{
	
	
		if(a>0)
		prime(a);
		else if(a<0)
		{
		
			printf("re_enter a number\n");
			scanf("%d",&a);
		}
		else
		printf("entered number is zero\n");
		
	
		}
		void prime(int b)
		{
			printf("you entered a positive integer\n");
		}
	
