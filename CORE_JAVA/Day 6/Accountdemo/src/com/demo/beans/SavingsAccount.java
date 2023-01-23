package com.demo.beans;

public class SavingsAccount extends Account{
	public static float interestRate;
	public static float minBal;
	private String cbNum;

	static {
		interestRate = 0.04f;
		minBal = 10000;
	}

	public SavingsAccount() {
		super();
		this.cbNum = null;
	}

	public SavingsAccount(int id, 
			String name, String mobile, int pin, 
			float balance, String em,String cbNum) {
		super(id, name, mobile, pin,balance,em);
		this.cbNum = cbNum;
	}


	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		SavingsAccount.interestRate = interestRate;
	}

	public String getCbNum() {
		return cbNum;
	}

	public void setCbNum(String cbNum) {
		this.cbNum = cbNum;
	}

	public String toString() {
		return super.toString()+"SavingsAccount [cbNum=" + cbNum + "]";
	}

	@Override		//checks for the errors at compile time
	public void withdraw(float amount) {
		if(balance-amount>=minBal) {
			this.balance=this.balance - amount;
		}
		else
			System.out.println("Insufficient balance!");
	}
}
