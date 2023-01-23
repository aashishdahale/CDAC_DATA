package com.demo.service;

import com.demo.interfaces.Interface1;

import com.demo.interfaces.Interface5;

public class MyClass11 implements Interface1,Interface5 {

	@Override
	public int m31() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m32() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m41() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m42() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m51() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m11() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m12() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultf1() {
		Interface1.super.defaultf1();
		Interface5.super.defaultf1();
		System.out.println("default in class");
	}

}
