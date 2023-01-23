.package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class WriteObjectData {

	public static void main(String[] args) {
		try (DataOutputStream dos=new DataOutputStream(new FileOutputStream("testdata.dat"));
			DataInputStream dis=new DataInputStream(new FileInputStream("testdata.dat"));){
			dos.writeInt(123);
			dos.writeUTF("Testing");
			dos.writeDouble(3456.67);
			
			int num=dis.readInt();
			String s=dis.readUTF();
			double sal=dis.readDouble();
			System.out.println(num+"===="+s+"==="+sal);
		
		}catch(IOException e) {
			System.out.println("file not found");
		}
	}

}
