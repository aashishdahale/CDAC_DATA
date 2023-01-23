#include<stdio.h>

void main()
{
	int choice;

	while(1) //infinite loop
	{
	
		printf("\nMENU");
		printf("\n1.square\n2.sumof digits\n3.factorial\n4.Exit");
		
		printf("\nEnter your choice :");
		scanf("%d",&choice);
		if(choice==4)
			break;
		
		switch(choice)
		{
			case 1:printf("\nsquare ");
				break;
			
			case 2:printf("\nSum of digits");
				break;
			case 3:printf("\nFactorial");
				break;
			case 4:
				break;
			default:printf("\nWrong choice");
			break;
		}
	}
	
	
	
}
