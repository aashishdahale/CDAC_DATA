package com.demo.beans;

import java.util.concurrent.Callable;

public class MyDigitsum implements Callable<String>{
	private int num;
	

	public MyDigitsum(int num) {
		super();
		this.num = num;
	}


	@Override
	public String call() throws Exception {
		int sum=0;
		int num1=num;
		while(num>0) {
			int d=num%10;
			sum=sum+d;
			num=(int)(num/10);
		}
		System.out.println("Thread : "+Thread.currentThread().getId()+"Digit sum : "+num1);
		return "Sum of digits of : "+num1+ ": "+sum;
	}
	

}
