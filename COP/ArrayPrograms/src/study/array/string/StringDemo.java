package study.array.string;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		System.out.println("Length is :"+len);
		
		System.out.println(str.toLowerCase());
		
		char c=str.charAt(1);
		
		System.out.println(c);
		
		if(str.equals("hell"))
		{
			System.out.println("Hello welcome all");
		}
		
		
		
		
		
		
		

	}

}
