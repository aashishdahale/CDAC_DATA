package com.demo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Product;

public class TestProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Product[] parr=new Product[2];
		for(int i=0;i<parr.length;i++) {                    
			System.out.println("enetr id");
			int id=sc.nextInt();
			System.out.println("enetr name");
			String nm=sc.next();
			System.out.println("enter expiry date(dd/mm/yyyy");
			String dt=sc.next();
			//convert String to Date
			Date expdt;
			try {
				expdt = sdf.parse(dt);
				parr[i]=new Product(id,nm,expdt);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		for(Product p:parr) {
			System.out.println(p);
		}
		for(Product p:parr) {
			System.out.println(p.getExpdate().getMonth());
			if(p.getExpdate().getMonth()==10) {
			     System.out.println(p);
			}
		}
	}

}
