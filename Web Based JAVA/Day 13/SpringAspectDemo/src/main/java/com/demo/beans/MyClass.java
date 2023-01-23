package com.demo.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyClass {
	@Value("12")
	private int id;
	@Value("Rajat")
	private String name;
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
		System.out.println("in setid");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("in setname");
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	
	public void method1(){
		System.out.println("in method1");
		
	}
	public int method2(){
		System.out.println("in method2");
		return 10;
		
	}

}
