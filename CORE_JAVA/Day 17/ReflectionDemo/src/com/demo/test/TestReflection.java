package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.demo.beans.MyClass;

public class TestReflection {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		Class cls = ob.getClass();
		Field[] fields=cls.getDeclaredFields();
		for(Field f:fields) 
		{
			System.out.println("Name : "+f.getName());
			System.out.println("Specifiers : "+f.getModifiers());
			if(f.getName().equals("id")) 
			{
				f.setAccessible(true);
			}
		}
		
		Method[] marr=cls.getDeclaredMethods();
		for(Method m:marr) 
		{
			System.out.println(m.getName());
		}
		
		try {
			Method m=cls.getDeclaredMethod("method1", int.class);
			try {
				m.invoke(ob, 12);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException|SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Constructor[] carr=cls.getDeclaredConstructors();
		for(Constructor c:carr) {
			System.out.println("name : " +c.getName());
			System.out.println("parameter count : "+c.getParameterCount());
			Parameter[] parr=c.getParameters();
			for(Parameter p:parr) {
				System.out.println("name : "+p.getName());
				System.out.println("type : "+p.getType());
			}
			
		}
		
		//static members
		System.out.println("static members");
		Class cls1=MyClass.class;
		Method[] smlist=cls1.getMethods();
		for(Method m:smlist) {
			System.out.println("Name : "+m.getName());
		}
		
		Field[] flst=cls1.getDeclaredFields();
		for(Field f:flst) {
			System.out.println(f.getName());
		}
		
		Method m;
		try {
			m = cls1.getDeclaredMethod("mystaticmethod");
			try {
				m.invoke(MyClass.class);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException|SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

}
