package com.demo.threads;

import com.demo.beans.MyNumFunctions;

public class MyCheckPrimeThread extends Thread{
	private MyNumFunctions ob;
	private int n;
	public MyCheckPrimeThread(MyNumFunctions ob, int n) {
		this.ob=ob;
		this.n=n;
		
	}
	
    public void run(){
    	boolean flag=ob.checkPrime(n);
		System.out.println("Prime number :"+n+"---->"+flag);
    }
}
