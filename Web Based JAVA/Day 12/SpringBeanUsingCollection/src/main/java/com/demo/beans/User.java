package com.demo.beans;

import java.util.List;

public class User {
	private int uid;
	private String uname;
	private List<Address> addrlist;
	public User() {
		super();
	}
	public User(int uid, String uname, List<Address> addrlist) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addrlist = addrlist;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public List<Address> getAddrlist() {
		return addrlist;
	}
	public void setAddrlist(List<Address> addrlist) {
		this.addrlist = addrlist;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", addrlist=" + addrlist + "]";
	}
  
}
