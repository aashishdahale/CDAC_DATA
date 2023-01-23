package com.demo.beans;

public class ContractEmp extends Employee{
	private int hrs;
	private double charges;
	public ContractEmp() {
	
		hrs=0;
		charges=0;
	}
	public ContractEmp(int id,String nm,String em,String dt,String ds,int hrs,double ch) {
		super(id,nm,em,dt,ds);
		this.hrs=hrs;
		this.charges=ch;
	}
	public void setHrs(int h) {
		hrs=h;
	}
	public void setCharges(int ch) {
		charges=ch;
	}
	public int getHrs() {
		return hrs;
	}
	public double getcharges() {
		return charges;
	}
	public String toString() {
		return super.toString()+"Hrs : "+hrs+"Chatges :" +charges;
	}
    public double calculateSal() {
    	return hrs*charges;
    }
}
