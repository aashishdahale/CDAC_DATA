package com.demo.SpringBootMVCCRUDProduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringBootMVCCRUDProduct.beans.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
