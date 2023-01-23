package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Student;
import com.demo.beans.User;

public class TestListCollection {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Student s=(Student)ctx.getBean("st1");
        System.out.println(s);
        User u=(User)ctx.getBean("u1");
        System.out.println(u);
	}

}
