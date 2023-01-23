package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Account;

public class MyBalanceComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		if(o1.getBalance()<o2.getBalance()) {
			return 1;
		}
		else if(o1.getBalance()==o2.getBalance()) 
			return 0;
		else 
			return -1;
			
	}

}
