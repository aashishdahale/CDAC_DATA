package com.demo.test;

import com.demo.service.FileService;
import com.demo.service.FileServiceImpl;

public class AppendFileDemo {

	public static void main(String[] args) {
		FileService fservice=new FileServiceImpl();
		fservice.copyorAppendFile(args[0],args[1]);

	}

}
