package com.demo.test;

import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Account;

public class TestAccountClass {
	public static void main(String[] args) {
		Set<Account> ts=new TreeSet<>();
		ts.add(new Account(1,"xxxx",1234));
		ts.add(new Account(1,"xxxx",3333));
		ts.add(new Account(2,"yyyy",1234));
		ts.add(new Account(3,"zzzzz",5555));
		System.out.println(ts);
	}

}
