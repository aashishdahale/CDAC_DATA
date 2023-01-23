package com.demo.beans;

abstract public class Account {
	private int id;
	private String name;
	private String mobile;
	private String email;
	private int pin;
	protected float balance;
	
	public Account() {
		this.id = 0;
		this.name = null;
		this.mobile = null;
		this.email=null;
		this.pin = 0;
		this.balance = 0;
	}
	
	public Account(int id, 
			String name, String mobile, int pin,
			float balance,String em) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email=em;
		this.pin = pin;
		this.balance = balance;
	}

	abstract public void withdraw(float amount);
	
	public int getId() {
		return id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	void deposit(float amount) {
		this.balance=this.balance + amount;
	}
	
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", mobile=" + mobile + ", pin=" + pin + ", balance=" + balance
				+"email" +this.email+ "]";
	}
	
	
	
	
}
