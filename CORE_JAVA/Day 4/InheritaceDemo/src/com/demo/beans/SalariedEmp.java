package com.demo.beans;

public class SalariedEmp extends Employee {
	private double sal,bonus;
	
	public SalariedEmp() {
		sal=0;
		bonus=0;
	}
	
	public SalariedEmp(int id, String nm,String em,String dt,String ds,double sal) {
	  super(id,nm,em,dt,ds);
	  this.sal=sal;
	  this.bonus=0.10*this.sal;
		
	}
	public void setSal(double s) {
		this.sal=s;
		
	}
	public void setBonus(double b) {
		this.bonus=b;
		
	}
	
	public double getSal() {
		return sal;
	}
	public double getBonus() {
		return bonus;
	}
	public double calculateSal() {
		return  sal+0.10*sal+0.15*sal-0.08*sal+this.bonus;
	}
	public String toString() {
		return super.toString()+"Salary "+sal+"Bonus : "+bonus;
	}
	
	
	
	

}
