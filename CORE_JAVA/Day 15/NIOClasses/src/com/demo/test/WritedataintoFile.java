package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritedataintoFile {
	public static void main(String[] args) {
		
		try {
			Path p=Paths.get("./testfile1.txt");
			String str="This is testing data into file";
			byte[] barr=str.getBytes();
			Files.write(p,barr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
