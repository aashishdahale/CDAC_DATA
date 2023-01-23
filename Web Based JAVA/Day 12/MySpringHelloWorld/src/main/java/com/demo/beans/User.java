package com.demo.beans;

public class User {
	private int uid;
	private String fname;
	private String lname;
	private Address addr;
	public User() {
		super();
		System.out.println("in user default constructor");
	}
	public User(int uid, String fname, String lname, Address addr) {
		super();
		System.out.println("in user parametrized constructor");
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		System.out.println("in set uid");
		this.uid = uid;
	}
	public String getFname() {
		
		return fname;
	}
	public void setFname(String fname) {
		System.out.println("in set fname");
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		System.out.println("in set lname");
		this.lname = lname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		System.out.println("in set addr");
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", addr=" + addr + "]";
	}
	

}
