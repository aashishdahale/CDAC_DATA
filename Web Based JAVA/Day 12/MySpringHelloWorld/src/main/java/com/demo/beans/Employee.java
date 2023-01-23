package com.demo.beans;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	public Employee() {
		super();
		System.out.println("in Employee default constructor");
	}
	
	public Employee(int eid, String ename, double sal) {
		super();
		System.out.println("in Employee parametrized  constructor");
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		System.out.println("in set eid");
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("in set ename");
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		System.out.println("in set sal");
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}
