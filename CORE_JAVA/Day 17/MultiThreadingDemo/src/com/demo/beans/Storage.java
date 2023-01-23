package com.demo.beans;

public class Storage {
	private int n;
	private boolean valueSet;
	public Storage() {
		valueSet=false;
	}
	
	synchronized public void put(int i) {
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=i;
		System.out.println("put : "+n);
		valueSet=true;
		notify();
 	}
	
	synchronized public void get() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got: "+n);
		valueSet=false;
		notify();
	}

}
