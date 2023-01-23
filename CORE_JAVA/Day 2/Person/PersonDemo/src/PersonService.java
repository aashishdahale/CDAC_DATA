import java.util.Scanner;

public class PersonService {
	public static void acceptPesrsondata(Person[] ob) 
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ob.length;i++) {
			System.out.println("enetr id");
			int id=sc.nextInt();
			System.out.println("enetr Name");
			sc.nextLine();
			String nm=sc.nextLine();
			System.out.println("enetr mobile");
			String mob=sc.next();
			ob[i]=new Person(id,nm,mob);
			
			
		}
		
	}

	public static void displayPersondata(Person[] ob) 
	{
		for(int i=0;i<ob.length;i++) 
		{
			System.out.println(ob[i]);
		}
		
	}
}
