#include<stdio.h>
#include<string.h>
void main()
{
	int i;
	char str[10];
	//char by char
/*	printf("\nenter string of chars");
	for(i=0;i<10;i++)
	{
		fflush(stdin);
		scanf("%c",&str[i]);
	}
	for(i=0;i<10;i++)
	{
		printf("%c",str[i]);
	}
*/

	printf("\nEnter the string :");
//	scanf("%s",str);
	//printf("\nEntered sting is :%s",str);
	
	//input using gets
	gets(str);
		printf("\nEntered sting is :%s",str);
		puts(str);
	
	
	

}
