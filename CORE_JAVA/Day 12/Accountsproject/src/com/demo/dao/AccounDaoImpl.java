package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.comparators.MyBalanceComparator;

public class AccounDaoImpl implements AccountDao
{
	static Set<Account> hset;
	static {
		hset=new HashSet<>();
		hset.add(new Account(1,"xxx",1234));
		hset.add(new Account(2,"yyy",3333));
		hset.add(new Account(3,"zzzz",2345));
		hset.add(new Account(4,"pppp",1234));
		hset.add(new Account(5,"sssss",11111));
	}
	@Override
	public Set<Account> findAll() {
		return hset;
	}
	@Override
	public List<Account> findTopN(int n) {
		List<Account> lst=new ArrayList<>();
		List<Account> lst1=new ArrayList<>();
		lst.addAll(hset);
		Comparator<Account> c=(o1,o2)->{
			if(o1.getBalance()<o2.getBalance()) {
				return 1;
			}
			else if(o1.getBalance()==o2.getBalance()) 
				return 0;
			else 
				return -1;
		};
		Collections.sort(lst,c);
		for(int i=0;i<lst.size() && i<n;i++) {
		    lst1.add(lst.get(i));	
		}
		return lst1;
		}
		

}
