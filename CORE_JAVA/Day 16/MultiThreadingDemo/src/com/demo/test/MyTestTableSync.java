package com.demo.test;

import com.demo.beans.MyTableSync;
import com.demo.threads.MyPrintTableSync;


public class MyTestTableSync {

	public static void main(String[] args) {
		MyTableSync ob=new MyTableSync();
		MyTableSync ob1=new MyTableSync();
		MyPrintTableSync th1=new MyPrintTableSync(ob, 7);
		th1.start();
		MyPrintTableSync th2=new MyPrintTableSync(ob1, 3);
		th2.start();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
		
			
			e.printStackTrace();
		}
		

	}

}
