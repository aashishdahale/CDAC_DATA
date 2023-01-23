package com.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServiceImpl implements FileService
{
	@Override
	public void copyFile(String fname1, String fname2) {
		try(FileInputStream fis=new FileInputStream(fname1);
			FileOutputStream fos=new FileOutputStream(fname2);	) {
				
			int x=fis.read();
			while(x!=-1) {
				fos.write(x);
				x=fis.read();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}catch(IOException e) {
			System.out.println("file cannot be read or write");
		}
		
	}

	@Override
	public void copyorAppendFile(String fname1, String fname2) {
		File f=new File(fname2);
		FileOutputStream fos=null;
		try {
				//check whether file exists
				if(f.exists()) {
					//open in append mode
					System.out.println("opening in append mode");
					 fos=new FileOutputStream(fname2,true);	
				}else {
					//open it in write mode
					System.out.println("opening in write mode");
					fos=new FileOutputStream(fname2);
				}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		
		try(FileInputStream fis=new FileInputStream(fname1);
			FileOutputStream fos1=fos;	){
			int x=fis.read();
			while(x!=-1) {
				fos1.write(x);
				x=fis.read();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}catch(IOException e) {
			System.out.println("file not found");
		}
		
	}
     
}
