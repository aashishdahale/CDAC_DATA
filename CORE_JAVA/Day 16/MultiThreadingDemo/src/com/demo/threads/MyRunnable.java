package com.demo.threads;

import com.demo.beans.MyTable;

public class MyRunnable implements Runnable{
	private int n;
	private MyTable t;
	public MyRunnable(MyTable t,int n){
		this.t=t;
		this.n=n;
	}


	public void run() {
		t.printTable(n);
	}

}
