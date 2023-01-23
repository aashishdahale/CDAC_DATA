package com.demo.test;

import java.util.Scanner;

//import com.demo.beans.ContractEmp;
//import com.demo.beans.Employee;
//import com.demo.beans.SalariedEmp;
import com.demo.beans.*;
public class TestEmployee {

	public static void main(String[] args) {
		//Employee e=new Employee(100,"Rajan","rojrocks@gmai.com","hr","manager");
		//System.out.println(e);
		Scanner sc=new Scanner(System.in);
		SalariedEmp s=new SalariedEmp(12,"Revati","Rev@gmail.com","ux","Designer",345675);
		System.out.println(s instanceof SalariedEmp);
		System.out.println(s instanceof Employee);
		System.out.println(s instanceof Person);
		System.out.println(s.calculateSal());
		ContractEmp c=new ContractEmp(12,"Revati","Rev@gmail.com","ux","Designer",34,3000);
		System.out.println(c.calculateSal());
		System.out.println("1. SalariedEmp \n 2.ContractEmp");
		int choice=sc.nextInt();
		Person e=null;
		switch(choice) {
		case 1:
			 e=new SalariedEmp(12,"Revati","Rev@gmail.com","ux","Designer",345675);
			
			break;
		case 2:
		    e=new ContractEmp(12,"Revati","Rev@gmail.com","ux","Designer",34,3000);
			
			break;
		}
		System.out.println(((Employee)e).calculateSal());
		
		
	}

}
