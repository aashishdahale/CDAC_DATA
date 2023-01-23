package com.demo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.demo.beans.Employee;
import com.demo.beans.HelloWorld;

public class TestBeanFactory {
public static void main(String[] args) {
	BeanFactory beanfact=new XmlBeanFactory(new ClassPathResource("springconfig.xml"));
	HelloWorld h=(HelloWorld)beanfact.getBean("hw");
	h.sayHello();
	Employee e1=(Employee)beanfact.getBean("emp1");
	System.out.println(e1);
	Employee e2=(Employee)beanfact.getBean("emp1");
	System.out.println(e2);
	e2.setEname("testing");
	System.out.println(e1);
	System.out.println(e2);
	//Employee e3=(Employee)beanfact.getBean("emp2");
	//System.out.println(e3);
		
}
}
