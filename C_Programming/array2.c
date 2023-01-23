#include<stdio.h>
void main()
{
	int i,mult;
	int arr[10]={1,2,3,4,5,6,7,8,9,10}; 
	//array intialization
	
	for(i=0;i<10;i++)
	{
		mult=arr[i]*arr[i];
		printf("\n mult :%d",mult);
	}

	
}
