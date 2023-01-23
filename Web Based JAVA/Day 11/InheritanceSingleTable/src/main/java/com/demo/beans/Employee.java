package com.demo.beans;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="emphirarchy11")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emptype",discriminatorType = DiscriminatorType.STRING)
public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String name;
	private String dept;
	public Employee() {
		super();
	}
	public Employee(int eid, String name, String dept) {
		super();
		this.eid = eid;
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
