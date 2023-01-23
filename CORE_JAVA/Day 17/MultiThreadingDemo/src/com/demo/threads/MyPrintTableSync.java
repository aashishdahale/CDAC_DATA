package com.demo.threads;

import com.demo.beans.MyTableSync;

public class MyPrintTableSync extends Thread{
	private MyTableSync t;
	private int n;
	
	public MyPrintTableSync(MyTableSync t, int n) {
		super();
		this.t = t;
		this.n = n;
	}

	public void run() {
		t.printTable(n);
	}

}
