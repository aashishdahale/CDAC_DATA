class Test
{
	public static void main(String [] args)
	{
		int num=4;
		/*boolean r=checkNum(num);
		*/
		//if(r)
			if(checkNum(num))
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		
		
		printPrime();
	
	
	}
	public static boolean checkNum(int num)
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	public static void printPrime()
	{
		int count=0;
		for(int i=2;i<=100;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(i);
		}
	}
	
	
}