package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.beans.Employee;

public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("before getbean");
		Employee e1=(Employee)ctx.getBean("emp1");
		System.out.println(e1);
		
	}
}
