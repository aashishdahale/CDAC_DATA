package com.demo.beans;

public class MyClass {
	private int id;
	private String name;
	static int cnt=0;
	public MyClass() {
		super();
	}
	public MyClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		MyClass.cnt = cnt;
	}
	public static void mystaticmethod() {
		System.out.println("in mystatic method");
	}
	public void method1(int n) {
		System.out.println("in method 1"+n);
	}
	
	public void method2() {
		System.out.println("In method 2");
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	

}
