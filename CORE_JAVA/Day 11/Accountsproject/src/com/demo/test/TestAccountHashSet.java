package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

public class TestAccountHashSet {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		AccountService aservice=new AccountServiceImpl();
		do {
		
		System.out.println("1. assign type to a  account\n 2.find topn accounts based on balance\n 3. display all\n4. exit");
		System.out.println("choice");
	 choice=sc.nextInt();
		switch(choice) {
		case 2:
			System.out.println("Enter n value");
			int n=sc.nextInt();
			List<Account> lst=aservice.getTopNAccounts(n);
			lst.stream().forEach(x->System.out.println(x));
			break;
		case 3:
			Set<Account> aset=aservice.getAll();
			aset.stream().forEach(x->System.out.println(x));
			
			break;
		case 4:
			System.out.println("Thank you for visiting .....");
			sc.close();
			break;
		}
		}while(choice!=4);
	}

}
