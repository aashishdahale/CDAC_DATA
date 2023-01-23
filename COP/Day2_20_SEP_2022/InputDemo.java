
import java.util.*;

class InputDemo
{
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter rollno,age,per:");

		int rollNo=sc.nextInt();
		String name=sc.nextLine();
		int age=sc.nextInt();
		
		float per=sc.nextFloat();
			
		System.out.println("\nRoll no"+rollNo+"Age "+age+"Percentage"+per+"Name="+name);
	
	
	}


}