package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="conttab2234")
public class ContractEmployee extends Employee{
	private double charges,hrs;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(String name,String dept,double charges, double hrs) {
		super(name,dept);
		this.charges = charges;
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	@Override
	public String toString() {
		return super.toString()+"ContractEmployee [charges=" + charges + ", hrs=" + hrs + "]";
	}
	
	
	
	

}
