package com.demo.beans;

abstract public class Employee extends Person{
	private String dept,desg;
	public Employee() {
		System.out.println("in Employe default constructor");
		dept=null;
		desg=null;
	}
	
	public Employee(int id,String name,String em,String dept,String desg) {
		super(id,name,em);
		System.out.println("in Employe parametrized constructor");
		
		this.dept=dept;
		this.desg=desg;
	}
	
	public void setDept(String dt) {
		this.dept=dt;
	}
	
	public void setDesg(String ds) {
		this.desg=ds;
	}
	public String getDept() {
		return dept;
	}
	public String getDesg() {
		return desg;
	}
	abstract public double calculateSal();
	public String toString() {
		return super.toString()+"Department : "+this.dept +"Designation :"+this.desg;
	}
}
