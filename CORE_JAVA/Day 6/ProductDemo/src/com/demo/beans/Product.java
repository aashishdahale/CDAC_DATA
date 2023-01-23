package com.demo.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	private int pid;
	private String pname;
	private Date expdate;
	public Product() {
		super();
	}
	public Product(int pid, String pname, Date expdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.expdate = expdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	@Override
	public String toString() {
		//convert date to string
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String dt=sdf.format(expdate);
		return "Product [pid=" + pid + ", pname=" + pname + ", expdate=" + dt + "]";
	}
	

}
