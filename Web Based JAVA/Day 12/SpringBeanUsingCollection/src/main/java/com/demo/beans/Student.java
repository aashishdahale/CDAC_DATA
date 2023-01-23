package com.demo.beans;
import java.util.List;
import java.util.Properties;

public class Student {
	private int id;
	private String name;
	private List<String> courses;
	
	public Student() {
		super();
	}

	public Student(int id, String name, List<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
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

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}

	
	

}
