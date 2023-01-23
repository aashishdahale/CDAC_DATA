import java.util.Scanner;

public class Arraydemo1 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nenter array elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("\nArray elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		

	}

}
