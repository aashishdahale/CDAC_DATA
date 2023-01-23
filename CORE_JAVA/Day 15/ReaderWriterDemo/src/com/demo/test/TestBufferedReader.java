package com.demo.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("enetr id");
			String str=br.readLine();
			int id=Integer.parseInt(str);
			System.out.println("enetr name");
			String  name=br.readLine();
			
			System.out.println("you enterd "+id+" \nName: "+name);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
