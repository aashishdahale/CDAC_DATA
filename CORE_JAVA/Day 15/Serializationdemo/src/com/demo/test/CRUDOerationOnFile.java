package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.FileService;
import com.demo.service.FileServiceImpl;

public class CRUDOerationOnFile {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		//read file
		FileService fservice=new FileServiceImpl();
		fservice.readFile("empdata.dat");
		do {
		System.out.println("1. add new Employee\n 2.delete employee\n 3. modify employee\n4. display all\n5.exit\n");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			fservice.addnewemplyee();
			break;
		case 2:
			System.out.println("enetr id");
			int id=sc.nextInt();
			boolean status=fservice.deleteployee(id);
			if(status) {
				System.out.println("deleted successfully");
				
			}
			else {
				System.out.println("Not Found");
			}
			break;
		case 3:
			System.out.println("enetr id");
			id=sc.nextInt();
			System.out.println("enetr desg");
			String desg=sc.next();
			status= fservice.updateEmeployee(id,desg);
			if(status) {
				System.out.println("updated successfully");
				
			}
			else {
				System.out.println("Not Found");
			}
			break;
		case 4:
			List<Employee> elist=fservice.getAllEmployee();
			elist.forEach((x)->{System.out.println(x);});
			break;
		case 5:
			fservice.writeFile("empdata.dat");
			sc.close();
			System.out.println("thank you for visiting");
			break;
		}
		
		}while(choice!=5);

	}

}
