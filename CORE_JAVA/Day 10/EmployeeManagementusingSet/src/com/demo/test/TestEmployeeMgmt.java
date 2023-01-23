                                                                                                                                                                                                                                                                                                                         package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl(); 
		int choice=0;
		do {
			System.out.println("1. add new Employee\n2. remove by id\n 3. remove by name\n");
			System.out.println("4. display all\n5.find by id\n6. sort by salary\n");
			System.out.println("7. display all with salary > given salary\n8.modify salary\n9.find by name 10.exit\n ");
			System.out.println("choice :");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				eservice.addEmployee();
				
				break;
				
			case 2:
				System.out.println("Please enter the id:");
				int id = sc.nextInt();
				boolean status =  eservice.removeById(id);
				if(status)
					System.out.println("deleted successfully!");
				else
					System.out.println("Not found!");
				break;
				
			case 3:{
				System.out.println("Please enter name of Employee which is to be deleted");
				String nm=sc.next(); 
				status=eservice.removeByName(nm);
				if(status) {
					System.out.println("Deleted Successfully !!!");
				}
				else {
					System.out.println("Not found");
				}
				break;
			}
				
				
			case 4:
				Set<Employee> eset = eservice.displayAll();
				if(eset!=null) {
					eset.stream().forEach(x->{System.out.println(x);});
				}
				else
					System.out.println("Not found!!");
				break;
				
			case 5:
				System.out.println("Enter id: ");
				id=sc.nextInt();
				Employee e = eservice.findById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not found");
				}
				
				break;
			
				
			case 6:{
				eset=eservice.sortBySalary();
				for(Employee e1: eset) 
				{
					System.out.println(e1);
				}
				break;
			}
			
			case 7:{
				System.out.println("Enter Salary to search");
				double salary = sc.nextDouble();
				
				List<Employee> l1=eservice.findBySalary(salary);
				if(l1!=null) {
					l1.stream().forEach(x->{System.out.println(x);});
				}
				else
					System.out.println("Not found!!");
				break;
				
				
			}
			
			case 8:{
				System.out.println("Enter id: ");
				id = sc.nextInt();
				System.out.println("Enter new Salary: ");
				double sal = sc.nextDouble();
				status= eservice.modifySalary(id,sal);
				if(status) {
					System.out.println("Modified successfully");
				}
				else {
					System.out.println("Not found.");
				}
				
				break;
			}
				
			
			case 9:{
				System.out.println("Enter name: ");
				String nm = sc.next();
				List<Employee> li = eservice.findByName(nm);
				if(li!=null) {
					li.stream().forEach(x-> {System.out.println(x);});
				}
				else
					System.out.println("Not found");
				
				break;
			}
			
				
				
			case 10:
				System.out.println("Thank you for visiting!!");
				sc.close();
				break;
			}

		}while(choice!=10);

	}
}