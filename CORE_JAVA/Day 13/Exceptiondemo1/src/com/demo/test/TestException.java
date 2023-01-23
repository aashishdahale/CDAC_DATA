package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			try {	
				//String s=null;
				System.out.println("enter number");
				int n=sc.nextInt();
				System.out.println("enter number");
				int n2=sc.nextInt();
				/*
				 * if(sc.hasNext()) { sc.next(); }
				 */
				int ans=divide(n,n2);
				System.out.println("Ans : "+ans);
				//System.out.println("length : "+s.length());
				break;
			}catch(InputMismatchException|NullPointerException e) {
				//e.getMessage();
				System.out.println(e.getMessage());
				//System.out.println("pls enetr numeric data");
				//e.printStackTrace();
				
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("cannot divide by zero");
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("error occured");
			}finally {
				System.out.println("in finally block");
			}
		}
		System.out.println("main continues from here");
		
	}

	private static int divide(int n, int n2) {
		n=n-2;
		n2=n2-1;
		try {
			return n/n2;
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
			throw e;
			//return 0;
		}
		
	}

}
