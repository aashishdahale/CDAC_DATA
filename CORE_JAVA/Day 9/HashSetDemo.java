package com.demo.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> intset=new HashSet<>();
		intset.add(23);
		intset.add(34);
		boolean status=intset.add(23);
		if(status) {
			System.out.println("added");
		}
		else {
			System.out.println("Duplicate number");
		}
		System.out.println(intset);
		intset.add(2);
		intset.add(100);
		intset.add(20);
		System.out.println(intset);
	}

}
