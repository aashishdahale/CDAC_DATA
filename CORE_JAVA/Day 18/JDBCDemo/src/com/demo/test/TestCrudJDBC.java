package com.demo.test;

import java.util.Scanner;

import com.demo.service.DeptService;
import com.demo.service.DeptServiceImpl;

public class TestCrudJDBC {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=0;
	DeptService dService=new DeptServiceImpl();
	do {
	System.out.println("1. add new department\n 2. delete the department \n 3. modify department\n");
	System.out.println("4. display all\n 5. display by id \n 6. exit\n");
	System.out.println("choice");
	switch(choice) {
	case 1:
		break;
	case 6:
		System.out.println("Thank you for visiting ......");
		dService.closeMyConnction();
		break;
		
	}
	}while(choice!=6);
}
}
