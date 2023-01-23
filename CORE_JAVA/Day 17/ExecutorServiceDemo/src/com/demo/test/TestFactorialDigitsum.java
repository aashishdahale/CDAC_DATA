package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.demo.beans.MyDigitsum;
import com.demo.beans.MyFactorialTask;

public class TestFactorialDigitsum {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(4);
		Scanner sc=new Scanner(System.in);
		List<Future> flist=new ArrayList<>();
		for(int i=0;i<3;i++) {
			System.out.println("enetr num");
			int num=sc.nextInt();
			MyFactorialTask tf=new MyFactorialTask(num);
			MyDigitsum df=new MyDigitsum(num);
			Future<String> f=es.submit(tf);
			Future<String> f1=es.submit(df);
			flist.add(f);
			flist.add(f1);
		}
		for(Future<String> f:flist) {
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        try {
			es.awaitTermination(2000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
