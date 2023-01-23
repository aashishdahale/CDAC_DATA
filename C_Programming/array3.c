#include<stdio.h>
void main()
{
	int i,mult;
	int arr[10]={1,2,3,4,5,6,7,8,9,10},square[10]; 
	//array intialization
	
	for(i=0;i<10;i++)
	{
	square[i]=arr[i]*arr[i];
		
	}
	for(i=0;i<10;i++)
	{
		printf("%d\t",square[i]);
	}
	
	
}
