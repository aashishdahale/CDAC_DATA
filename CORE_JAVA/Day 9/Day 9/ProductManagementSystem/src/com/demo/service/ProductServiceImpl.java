0000package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.demo.beans.Product;
import com.demo.comparators.MyNameComparator;

public class ProductServiceImpl implements ProductService{
	static List<Product> plist;
	static{
		plist=new ArrayList<>();
		plist.add(new Product(1,"chair",12,3456));
		plist.add(new Product(2,"Table",34,2000));
	}
	@Override
	public void addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int id=sc.nextInt();
		System.out.println("enetr name");
		String nm=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		float pr=sc.nextFloat();
		Product p=new Product(id,nm,qty,pr);
		plist.add(p);
		
	}
	@Override
	public List<Product> displayAll() {
		if(plist.size()>0) {
		 return plist;
		}
		return null;
	}
	@Override
	public Product findById(int id) {
		int pos=plist.indexOf(new Product(id));
		if(pos!=-1) {
			return plist.get(pos);
		}
		return null;
	}
	@Override
	public Product findByName(String nm) {
		for(Product p:plist) {
			if(p.getName().equals(nm)) {
				return p;
			}
		}
		return null;
	}
	@Override
	public boolean removeById(int id) {
		/*
		 * if(plist.contains(new Product(id))) {
		 * 
		 * }
		 */
		return plist.remove(new Product(id));
	}k+
	@Override
	public boolean removeByName(String nm) {
		Product p=findByName(nm);
		
		if(p!=null) {
			Scanner sc=new Scanner(System.in);
			System.out.println(p);
			System.out.println("do you want to delete it(y/n)?");
			String ans=sc.next();
			if(ans.equals("y")) {
				plist.remove(p);
				return true;
			}
			return false;
			
		}else {
			return false;
		}

	}
	@Override
	public List<Product> sortByPrice() {
		plist.sort(new MyNameComparator());
		return plist;
	}
	@Override
	public List<Product> findByqty(int qty) {
		/*
		 * List<Product> pdata=new ArrayList<>(); for(Product p:plist) {
		 * if(p.getQty()>qty) { pdata.add(p); } } return pdata;
		 */
		return plist.stream().filter(x->x.getQty()>qty).collect(Collectors.toList());
	}
	@Override
	public boolean modifyPrice(int id, float pr) {
		int pos=plist.indexOf(new Product(id));
		if(pos!=-1) {
			Product p=plist.get(pos);
			p.setPrice(pr);
			return true;
		}
		return false;
	}
	
}
