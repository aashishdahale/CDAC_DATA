 package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.beans.DematAccount;
import com.demo.beans.SavingsAccount;

public class AccountServiceImpl {
	private static Account[] acarr=new Account[10];
	private static int count;
	static
	{
		acarr[0]=new DematAccount(1,"Abc","77777",1111,20000,"xxx@sss",0.2f);
		acarr[1]=new DematAccount(2,"Bbc","127777",2222,25000,"yyy@sss",0.3f);
		acarr[2]=new DematAccount(3,"Cbc","45777",3333,22000,"xxx@sss",0.4f);
		acarr[3]=new SavingsAccount(4,"XYZ","222277",4444,32000,"eee@sss","AB000");
		acarr[4]=new SavingsAccount(5,"YYY","715877",5555,40000,"ddd@sss","BC111");
		acarr[5]=new SavingsAccount(6,"AAA","745677",6666,50000,"wwww@sss","CD555");
		count=6;
	}
	//this will withdraw amount if pin matched else return false
	public static boolean withdrawAmt(int accno, int pin, float amt) {
		// TODO Auto-generated method stub
		
		Account ac=searchAcc(accno);
		if(ac!=null)
		{
			if(ac.getPin()==pin)
			{
				ac.withdraw(amt);
				
				return true;
			}
			}
		return false;
	}
	//this will search account and return account object if found 
	//else return null
public static Account searchAcc(int accno)
{
	for(int i=0;i<count;i++)
	{
		if(accno==acarr[i].getId())
		{
			return acarr[i];
		}
		
	}
	return null;
	}
//this will change pin num if account found else return false
public static boolean changePin(int accno, int pin, int newpin) {
	// TODO Auto-generated method stub
	Account ac=searchAcc(accno);
	if(ac!=null && ac.getPin()==pin)
	{
		ac.setPin(newpin);
		return true;
	}
	return false;
}
public static void createNewAccount(int ch) {
	if(count<acarr.length) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account no:");
		int accno=sc.nextInt();
		System.out.println("Enter Account holder name:");
		String nm=sc.next();
		System.out.println("Enter mobile no:");
		String mob=sc.next();
		System.out.println("Enter  Email:");
		String em=sc.next();
		System.out.println("Enter pin no:");
		int pin=sc.nextInt();
		System.out.println("Enter balance :");
		float balance=sc.nextFloat();
		if(ch==1) {
			System.out.println("enetr cheque bk number");
			String chnum=sc.next();
			acarr[count]=new SavingsAccount(accno,nm,mob,pin,balance,em,chnum);
		}
		else{
			System.out.println("enetr commission");
			float comm=sc.nextFloat();
			acarr[count]=new DematAccount(accno,nm,mob,pin,balance,em,comm);
			
		}
		count++;
	}
}
}
