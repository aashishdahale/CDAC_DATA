package com.demo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ProductService;

public class TestJdBctemplateDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService pservice=(ProductService)ctx.getBean("pservice");


	}

}
