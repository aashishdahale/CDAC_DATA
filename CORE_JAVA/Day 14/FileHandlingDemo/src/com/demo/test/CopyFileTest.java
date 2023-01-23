package com.demo.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.demo.service.FileService;
import com.demo.service.FileServiceImpl;

public class CopyFileTest {

	public static void main(String[] args) {
		FileService fservice=new FileServiceImpl();
		fservice.copyFile(args[0],args[1]);
		//fservice.copyFile("emp.dat","empcopy.dat");

	}

}
