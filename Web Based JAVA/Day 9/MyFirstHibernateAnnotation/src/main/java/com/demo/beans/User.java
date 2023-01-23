package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="user22")
public class User {
	@Id
	@GeneratedValue
	private int uid;
	private String fname;
	private String lname;
	private String email;
	public User() {
		super();
	}
	public User(String fname, String lname, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	
	

}
