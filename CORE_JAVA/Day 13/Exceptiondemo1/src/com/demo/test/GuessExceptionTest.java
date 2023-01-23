package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.WrongNumberException;

public class GuessExceptionTest {
	public static void main(String[] args) {
		int num=50;
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("guess the number");
				int num1=sc.nextInt();
				cnt++;
				if(num1==num) 
				{
					System.out.println("hurray!! you won the game");
				}
				else 
				{
					//System.out.println("oops!! you lost the attempt number"+cnt);
					throw new WrongNumberException("oops!! you lost the attempt number"+cnt);
				}
				break;
			}catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("in main method continues the code");

	}

}
