#include<stdio.h>
#include<string.h>
int myStrlen(char []);

int myStrlen(char s[])
{
	int len=0,i   ;
	for(i=0;s[i]!='\0';i++)
	{
		len++;
	}
	return len;
}
void mystrcpy(char dest[],char source[])
{
	int i;
	for(i=0;source[i]!='\0';i++)
	{
		dest[i]=source[i];
	}
	dest[i]='\0';
}
void myConcat(char dest[],char source[])
{
	int len=myStrlen(dest);
	int i;
	
	for(i=0;source[i]!='\0';i++)
	{
		dest[len]=source[i];
		len++;
	}
	dest[len]='\0';
	
}
void main()
{
	int len=0;
	
	char str[10],dest[10];
	
	printf("\nEnter the string :");
	scanf("%s",str);
	
		printf("\nEnter another  string :");
	scanf("%s",dest);

	 len=strlen(str);
     len=myStrlen(str);
	
	//strcpy(dest,str);
	mystrcpy(dest,str);

	myConcat(dest,str);
	
	printf("concatenated string is :%s",dest);
 	printf("Length is :%d",len);
	
	

}
