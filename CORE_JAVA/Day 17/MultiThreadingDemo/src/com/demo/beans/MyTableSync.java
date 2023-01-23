package com.demo.beans;

import java.util.Vector;

public class MyTableSync {
	
		public synchronized void printTable(int n) {
			
			for(int i=1;i<=10;i++) {
				//synchronized(this){
				System.out.println(i+" * "+n+" = "+(n*i));
				//}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	


}
