package com.demo.beans;

import java.util.concurrent.Callable;

public class MyFactorialTask implements Callable<String> {
	private int n;

	public MyFactorialTask(int n) {
		super();
		this.n = n;
	}

	@Override
	public String call() throws Exception {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("thread "+Thread.currentThread().getId()+"---factorial "+n);
		return "factorial of "+n+":  "+f;
	}

}
