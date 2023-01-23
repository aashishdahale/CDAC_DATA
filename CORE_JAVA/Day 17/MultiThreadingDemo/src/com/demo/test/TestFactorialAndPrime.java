package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyNumFunctions;
import com.demo.threads.MyCheckPrimeThread;
import com.demo.threads.MyFactorialThread;

public class TestFactorialAndPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyFactorialThread[] farr=new MyFactorialThread[5];
		MyCheckPrimeThread[] carr=new MyCheckPrimeThread[5];
		MyNumFunctions ob=new MyNumFunctions();
		for(int i=0;i<5;i++) {
			System.out.println("enetr number");
			int n=sc.nextInt();
					
			farr[i]=new MyFactorialThread(ob, n);  
			farr[i].start();
			carr[i]=new MyCheckPrimeThread(ob, n); 
			carr[i].start();
		}
		for(int i=0;i<farr.length;i++) {
			try {
				farr[i].join();
				carr[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//farr[0].start();

	}

}
