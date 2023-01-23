package com.demo.threads;

import com.demo.beans.MyTable;

public class MyPrintThread extends Thread{
	private MyTable t;
	private int n;
	
	
	public MyPrintThread(MyTable t, int n) {
		super();
		this.t = t;
		this.n = n;
	}


	public void run() {
		t.printTable(n);
	}

}
