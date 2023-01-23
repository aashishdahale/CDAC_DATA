package com.demo.service;

import com.demo.beans.Account;
import com.demo.beans.DematAccount;
import com.demo.beans.SavingsAccount;

public class AccountService {
	private static Account[] acarr=new Account[10];
	private static int count;
	static
	{
		acarr[0]=new DematAccount(1,"Abc","77777",1111,20000,0.2f);
		acarr[1]=new DematAccount(2,"Bbc","127777",2222,25000,0.3f);
		acarr[2]=new DematAccount(3,"Cbc","45777",3333,22000,0.4f);
		acarr[3]=new SavingsAccount(4,"XYZ","222277",4444,32000,"AB000");
		acarr[4]=new SavingsAccount(5,"YYY","715877",5555,40000,"BC111");
		acarr[5]=new SavingsAccount(6,"AAA","745677",6666,50000,"CD555");
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
}
