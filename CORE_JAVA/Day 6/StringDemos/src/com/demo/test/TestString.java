package com.demo.test;

public class TestString {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		System.out.println("s1==s2"+(s1==s2));
		String s3=new String("hello");
		System.out.println("s1==s3"+(s1==s3));
		System.out.println("s1.equals(s3)"+(s1.equals(s3)));
		System.out.println(s1.hashCode()+ ","+s2.hashCode());
		System.out.println(s3.hashCode());
		StringBuilder sb=new StringBuilder("Hello");
	    StringBuffer sbuff=new StringBuffer("Welcome");

	}

}
