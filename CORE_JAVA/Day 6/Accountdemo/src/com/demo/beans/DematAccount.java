package com.demo.beans;

public class DematAccount extends Account {
	public static float interestRate;
	private float commission;
	
	static {
		interestRate = 0.08f;
	}
	public DematAccount() {
		super();
		this.commission =0;
	}
	public DematAccount(int id, 
			String name, String mobile, int pin,
			float balance,String em, float commission) {
		super(id, name, mobile, pin,balance,em);
		this.commission = commission;
	}
	public static float getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(float interestRate) {
		DematAccount.interestRate = interestRate;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	public String toString() {
		return super.toString()+"DematAccount [commission=" + commission + "]";
	}
	@Override
	public void withdraw(float amount) {
		if(amount<=5000) {
			this.balance = this.balance -amount;
		}
		else
			System.out.println("exceeding withdraw limit");
	}
	
	
}
