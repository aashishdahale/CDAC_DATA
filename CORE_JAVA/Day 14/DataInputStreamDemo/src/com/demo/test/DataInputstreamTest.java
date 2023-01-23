package com.demo.test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class DataInputstreamTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//(example :- D:\mydata\mydata.dat)
		System.out.println("enetr file name ");
		String fname=sc.next();
		try {
		      DataInputStream dis=new DataInputStream(new FileInputStream(fname));
		      String str=dis.readLine();
		      while(str!=null) {
		    	  System.out.println(str);
		    	  str=dis.readLine();
		      }
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
