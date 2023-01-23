package com.demo.test;

import com.demo.beans.MyTable;
import com.demo.threads.MyPrintThread;

public class TestTableThread {

	public static void main(String[] args) {
		MyTable t=new MyTable();
		//t.printTable(7);
		MyPrintThread t1=new MyPrintThread(t,7);
		//t.printTable(5);
		MyPrintThread t2=new MyPrintThread(t,5);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end of main");
	}

}
