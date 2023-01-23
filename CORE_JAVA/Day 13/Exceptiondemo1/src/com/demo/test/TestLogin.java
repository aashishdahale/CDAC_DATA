package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.demo.exceptions.WrongCredentialException;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class TestLogin {

	public static void main(String[] args) {
		LoginService ls=new LoginServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. add new user\n2. Login\n3. exit");
			System.out.println("choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				try {
					boolean status=ls.addNewUSer();
					if(status)
						System.out.println("acount created");
				}catch(WrongCredentialException  e) {
			
					System.out.println("you lost 3 attempts,pls contact admin");
					System.exit(1);
				}
				break;
			case 2:
				for(int i=0;i<3;i++) {
					try {
						System.out.println("enter username");
						String uname=sc.next();
						System.out.println("enter password");
						String pass=sc.next();
						boolean status=ls.validateUSer(uname,pass);
						if(status) {
							System.out.println("show product management demo menu here");
						}
						break;
					}catch(WrongCredentialException e) {
						System.out.println(e.getMessage());
						if(i==2) {
							System.out.println("you lost all attemots, pls contact administrator");
							System.exit(1);
						}
					}
				}
				break;
			case 3:
				System.out.println("Thank you for visiting ....");
				sc.close();
				break;
			}
		}while(choice!=3);

	}

}
