package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.ContractEmployee;
import com.demo.beans.SalariedEmployee;

public class TestInheritanceSingleTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Session session=sf.getCurrentSession();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		SalariedEmployee se=new SalariedEmployee(12, "Rajasi","Banking",34567,4566);
		ContractEmployee ce=new ContractEmployee(13, "Rohan","Admin",2000,20);
		session.save(ce);
		session.save(se);
		tr.commit();
		session.close();
		
	}

}
