package com.demo.SpringBootMVCCRUDProduct.service;

import java.util.List;

import com.demo.SpringBootMVCCRUDProduct.beans.Product;

public interface ProductService {

	List<Product> getAllProduct();

	void addnewProduct(Product product);

	Product getById(int pid);

	int updateProduct(Product product);

	void deleteById(int pid);

}
