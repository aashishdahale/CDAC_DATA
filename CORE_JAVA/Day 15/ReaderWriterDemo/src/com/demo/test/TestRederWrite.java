package com.demo.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestRederWrite {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("testfile.txt");
			FileWriter fw=new FileWriter("testfilecopy.txt")){
			int x=fr.read();
			while(x!=-1) {
				
				fw.write(x);
				x=fr.read();
				
			}
		
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
