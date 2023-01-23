import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter no of elements for array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		display(arr);
		
		
		

	}
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}








