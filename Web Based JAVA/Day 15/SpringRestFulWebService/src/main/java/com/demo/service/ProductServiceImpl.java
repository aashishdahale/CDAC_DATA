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
public Product addnewProduct(Product p) {
	return pdao.save(p);
	
	
}


@Override
public int deleteById(int pid) {
	return pdao.removeById(pid);
}


@Override
public int updateById(Product p) {
	return pdao.modifyById(p);
}
}
