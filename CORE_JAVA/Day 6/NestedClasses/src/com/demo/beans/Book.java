package com.demo.beans;

public class Book {
	private int bkid;
	private String name;
	Lesson l1;
	public class Lesson{
		int lid;
		String name;
		public Lesson(int id,String nm) {
			this.lid=id;
			this.name=nm;
		}
		public void m1() {
			System.out.println("in lesson m1 method");
			m2();
		}
	}
	public void m2() {
		System.out.println("in lesson m1 method");
	}
	

}
