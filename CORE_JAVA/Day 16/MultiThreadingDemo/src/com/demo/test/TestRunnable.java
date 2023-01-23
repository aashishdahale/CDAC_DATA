package com.demo.test;

import com.demo.beans.MyTable;
import com.demo.threads.MyRunnable;

public class TestRunnable {

	public static void main(String[] args) {
		MyTable t=new MyTable();
		MyRunnable r1=new MyRunnable(t,7);
		MyRunnable r2=new MyRunnable(t,5);
		Thread th1=new Thread(r1);
		th1.start();
		Thread th2=new Thread(r2);
		th2.start();
		System.out.println("main continues from here");
		
		try {
			th1.join();
			//th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends");
	}

}
