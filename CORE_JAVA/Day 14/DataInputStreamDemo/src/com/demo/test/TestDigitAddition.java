package com.demo.test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDigitAddition {
	public static void main(String[] args) {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("numbers.dat"));) 
		{
			String str=dis.readLine();
			while(str!=null) {
				int x=Integer.parseInt(str);
				System.out.println(x);
				int sum=0;
				while(x>0)
				{
					digit=x%10;
					sum=sum+digit;
					x=x/10;
					System.out.println("Sum of digits is:"+sum);
				}
				
				str=dis.readLine();
			}
			

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
