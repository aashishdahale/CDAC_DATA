package study.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int myarr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<myarr.length;i++)
		{
			myarr[i]=sc.nextInt();
		}
		System.out.println("\nEnter number to be searched in array");
		int eletosearch=sc.nextInt();
		
		//ArrayOperations.search(myarr, eletosearch);
		ArrayOperations.sortarray(myarr);
		ArrayOperations.display(myarr);
	}

}
