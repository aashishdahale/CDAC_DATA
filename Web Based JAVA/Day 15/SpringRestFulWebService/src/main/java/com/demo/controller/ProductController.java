package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

//@CrossOrigin(origins="*")
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	//Get all product
	@GetMapping("/products")
	public ResponseEntity<List<Product>> displayAll() {
		List<Product> plist=productService.displayAll();
		return ResponseEntity.ok(plist);
		
	}
	
	//get by Id
	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> displayById(@PathVariable int pid) {
		Product p=productService.displayById(pid);
		if(p!=null)
		    return ResponseEntity.ok(p);
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	//delete product
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable("pid") int pid) {
		int n=productService.deleteById(pid);
		if(n>0)
		   return new ResponseEntity("Deleted Successfully "+pid,HttpStatus.OK);
		else {
			return new ResponseEntity("Data not found "+pid,HttpStatus.NOT_FOUND);
		}
	}
	
	//add product
	@PostMapping("/products/{pid}")
	public ResponseEntity<Product> insertProduct(@RequestBody Product p) {
		Product p1=productService.addnewProduct(p);
		if(p1!=null)
		    return ResponseEntity.ok(p1);
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	
	//update product
	@PutMapping("/products/{pid}")
	public ResponseEntity updateProduct(@RequestBody Product p) {
		int n=productService.updateById(p);
		if(n>0)
			   return new ResponseEntity("updated Successfully "+p.getPid(),HttpStatus.OK);
			else {
				return new ResponseEntity("Data not found "+p.getPid(),HttpStatus.NOT_FOUND);
			}
		
	}
	
}
