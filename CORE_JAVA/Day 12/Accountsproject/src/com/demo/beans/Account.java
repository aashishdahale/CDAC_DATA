package com.demo.beans;



public class Account implements Comparable<Account>{
	private int id;
	private String nm;
	private double balance;
	public Account() {
		super();
	}
	public Account(int id, String nm, double balance) {
		super();
		this.id = id;
		this.nm = nm;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", nm=" + nm + ", balance=" + balance + "]";
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object o) {
		return this.id==((Account)o).id;
	}
	@Override
	public int compareTo(Account o) {
		/*
		 * if(this.balance<o.balance) { return 1; }else if(this.balance==o.balance) {
		 * if(this.id<o.id) return -1; else if(this.id==o.id) { return 0; } else return
		 * 1; } else return -1;
		 */
		if(this.id<o.id) 
			return -1; 
		else if(this.id==o.id) 
		 return 0; 
		else return 1;
				 
	}
	

}
