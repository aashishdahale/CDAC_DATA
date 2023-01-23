import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) 
	{
		MyHash myHash = new MyHash(10);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) 
		{
			String input = "";
			System.out.println("Enter Name:");
			input = sc.next();
			
			myHash.insert(input);
			myHash.search(input);			
		}
		
	}

}
