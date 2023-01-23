package com.demo.beans;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

//@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String name;
	private String dept;
	public Employee() {
		super();
	}
	public Employee( String name, String dept) {
		super();
		
		this.name = name;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int pid) {
		this.eid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
