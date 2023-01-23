package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.beans.User;

public class TestAnnotationConfig {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		User u=(User) ctx.getBean("user");
		System.out.println(u);

	}

}
