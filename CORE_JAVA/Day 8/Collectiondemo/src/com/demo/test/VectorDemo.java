package com.demo.test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(12,3);
		v.add(23);
		//v.add("skdjfkjs");
		System.out.println("capacity :"+v.capacity());
		System.out.println("size"+v.size());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println("capacity :"+v.capacity());
		System.out.println("size"+v.size());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println("capacity :"+v.capacity());
		System.out.println("size"+v.size());
		Enumeration<Integer> enum1=v.elements();
		//to navigate through each value in the vector.
		while(enum1.hasMoreElements()) {
			System.out.println(enum1.nextElement());
		}
	}

}
