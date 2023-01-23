package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;
import com.demo.beans.User;

public class TestProduct {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Session session=sf.openSession();
		//Transaction  tr=session.beginTransaction();
		///these atr in transient state
		Product p=new Product(140,"shelf",42,4561.89f);
		Product p1=new Product(150,"shoe rack",52,4671.89f);
		User u=new User("Revati","Khadilkar","rev.gmail.com");
		
		// convert it into persistent state
		//session.save(p1);
		//session.save(p);
		//session.save(u);
		//tr.commit();
		//session.close();
		Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
		Product p2=session1.get(Product.class, 140);
		System.out.println(p2);
		tr1.commit();
		

	}

}
