package com.demo.test;

public class Employee {
	private int empid;
	private String name;
	private String desg;
	public Employee() {
		super();
	}
	public Employee(int empid, String name, String desg) {
		super();
		this.empid = empid;
		this.name = name;
		this.desg = desg;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desg=" + desg + "]";
	}


}
