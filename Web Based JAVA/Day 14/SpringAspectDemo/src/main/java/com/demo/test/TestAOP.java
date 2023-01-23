package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyClass;

public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		MyClass ob=(MyClass) ctx.getBean("myClass");
		ob.method1();
		int n=ob.method2();
		System.out.println("Answer : " +n);
		//ob.setName("test");
		//ob.setId(20);
		
	}

}
