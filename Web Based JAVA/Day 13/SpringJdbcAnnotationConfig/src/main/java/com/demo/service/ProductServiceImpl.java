package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
   private ProductDao pdao;
   

//public ProductServiceImpl() {
//	super();
//}
//
//
//public ProductDao getPdao() {
//	return pdao;
//}
//
//
//public void setPdao(ProductDao pdao) {
//	System.out.println("in setPdao");
//	this.pdao = pdao;
//}


@Override
public List<Product> displayAll() {
	return pdao.findAll();
}


@Override
public List<Product> displayByPrice(double price) {
	return pdao.findByPrice(price);
}


@Override
public Product displayById(int pid) {
	return pdao.findById(pid);
}


@Override
public int addnewProduct() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter pid");
	int pid=sc.nextInt();
	System.out.println("enter pname");
	String pname=sc.next();
	System.out.println("enter qty");
	int qty=sc.nextInt();
	System.out.println("enter price");
	double price=sc.nextDouble();
	Product p=new Product(pid,pname,qty,price);
	return pdao.save(p);
	
	
}


@Override
public int deleteById(int pid) {
	return pdao.removeById(pid);
}


@Override
public int updateById(int pid, int qty, double price) {
	return pdao.modifyById(pid,qty,price);
}
}
