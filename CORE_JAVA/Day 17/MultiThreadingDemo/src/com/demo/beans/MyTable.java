package com.demo.beans;

public class MyTable {
	public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" * "+n+" = "+(n*i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
