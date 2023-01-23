package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable{
private int id;
private String name,desg;
public Employee() {
	super();
}
public Employee(int id) {
	this.id=id;
	name=null;
	desg=null;
}
public Employee(int id, String name, String desg) {
	super();
	this.id = id;
	this.name = name;
	this.desg = desg;
}
public int getId() {
	return id;
}


public boolean equals(Object obj) {
	if (id != ((Employee)obj).id)
		return false;
	return true;
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
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + "]";
}

}
