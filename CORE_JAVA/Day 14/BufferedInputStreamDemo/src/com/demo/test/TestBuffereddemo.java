package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBuffereddemo {

	public static void main(String[] args) {
		try(
				//open the files
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("emp.dat"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("empcopy.dat"));){
			//read file
			int x=bis.read();
			while(x!=-1) {
				//wrting in th file
				bos.write(x);
				x=bis.read();
			}
			
		}catch(IOException e) {
			System.out.println("file not found or no read/write permission");
		}
	}

}
