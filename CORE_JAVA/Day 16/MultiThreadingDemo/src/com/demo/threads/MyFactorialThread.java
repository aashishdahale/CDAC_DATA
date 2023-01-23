package com.demo.threads;

import com.demo.beans.MyNumFunctions;

public class MyFactorialThread extends Thread
{
	private MyNumFunctions ob;
	private int n;
	
	public MyFactorialThread(MyNumFunctions ob,int n) 
	{
		this.ob=ob;
		this.n=n;
		
	}
	public void run() 
	{
		int ans=ob.factorial(n);
		System.out.println("Factorial of : "+n+ " --->"+ans);
	}

}
