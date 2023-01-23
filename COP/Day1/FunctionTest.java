class functiontest
{
	public static void main(String args[])
	{
		int num1=10,num2=20;
		while(true)
		{
		System.out.println("\n1.ADD\n2.Sub\n3.Multiply\n4.Divide\n5.Exit");
		System.out.println("Enter your choice");
		int choice=5;
		if(choice==5)
			break;
		switch(choice)
		{
			case 1:
					add(num1,num2);
			break;
			case 2:
					subtrcat(num1,num2);
			break;
			case 3:
					multiply(num1,num2);
			break;
			case 4:	divide(num1,num2);
			break;
			case 5:break;
			default:
				System.out.println("Wrong Choice!!!");
			break;
			}
		}
		//add(num1,num2);
		//multiply(num1,num2);
	}
	public static void add(int n1,int n2)
	{
		int res=n1+n2;
		System.out.println("\nAddition is :"+res);
	}
	public static void multiply(int n1,int n2)
	{
		int res=n1*n2;
		System.out.println("\nMultiplication is :"+res);
	}
	public static void subtrcat(int n1,int n2)
	{
	}
	public static void divide(int n1,int n2)
	{
	}

}