package com.demo.test;

import com.demo.enums.Coffee;

public class TestEnum {

	public static void main(String[] args) {
		Coffee c=Coffee.medium;
		switch(c) {
		case small:
			System.out.println("small selected size : "+c.getSize()+ "Price : "+c.getPrice());
			break;
		case medium:
			System.out.println("medium selected size : "+c.getSize()+ "Price : "+c.getPrice());
			break;
		case large:
			System.out.println("large selected size : "+c.getSize()+ "Price : "+c.getPrice());
			break;
		}

	}

}
