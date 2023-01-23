package com.demo.service;

import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class MyClass implements Interface1, Interface2{

	@Override
	public void m21() {
		System.out.println("in m21");
		
	}

	@Override
	public int m22() {
		System.out.println("in m22");
		return 0;
	}

	@Override
	public int m11() {
		System.out.println("in m11");
		return 0;
	}

	@Override
	public void m12() {
		System.out.println("in m12");
		
	}

}
