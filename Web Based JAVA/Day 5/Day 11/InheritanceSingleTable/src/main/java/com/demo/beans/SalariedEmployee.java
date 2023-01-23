package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Sal")
public class SalariedEmployee extends Employee{
	private double sal;
	private double bonus;
	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(int id, String name,String dept,double sal, double bonus) {
		super(id,name,dept);
		this.sal = sal;
		this.bonus = bonus;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	

}
