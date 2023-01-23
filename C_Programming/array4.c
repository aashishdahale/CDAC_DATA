#include<stdio.h>
void main()
{
	int i,mult;
	int arr[10]={1,2,3,4,5,6,7,8,9,10}; 
	//array intialization
	printf("Before");
		for(i=0;i<10;i++)
		{
			printf("%d\t",arr[i]);
		}
	for(i=0;i<10;i++)
	{
	arr[i]=arr[i]*arr[i];
		
	}
		printf("After");
	for(i=0;i<10;i++)
	{
		printf("%d\t",arr[i]);
	}
	
	
}
