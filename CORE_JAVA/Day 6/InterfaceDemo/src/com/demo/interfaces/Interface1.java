package com.demo.interfaces;

public interface Interface1 {
	int m11();
	void m12();
	int i=34;
	public static void  staticef1() {
		System.out.println("in static f1 functions");
	}
	
	default void defaultf1() {
		System.out.println("in default f1");
	}

}
