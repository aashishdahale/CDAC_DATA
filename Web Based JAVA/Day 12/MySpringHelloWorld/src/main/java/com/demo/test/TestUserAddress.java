package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.User;

public class TestUserAddress {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springuseaddrconfig.xml");
		User u=(User)ctx.getBean("u1");
		System.out.println(u);
		

	}

}
