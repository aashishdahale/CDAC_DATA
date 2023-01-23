package com.demo.SpringBootMVCCRUDProduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringBootMVCCRUDProduct.beans.Product;
import com.demo.SpringBootMVCCRUDProduct.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/viewproducts")
	public ModelAndView displayAll() {
		List<Product> plist=productService.getAllProduct();
		return new ModelAndView("displayall","plist",plist);
		
		
	}
	
	@GetMapping("/addproduct")
	public String insertproduct() {
		return "addproduct";
		
	}
	
	@PostMapping("/insertProduct")
	public ModelAndView addProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty, @RequestParam double price) {
		productService.addnewProduct(new Product(pid,pname,qty,price));
		return new ModelAndView("redirect:/product/viewproducts");
	}
	
	@GetMapping("/editProduct/{pid}")
	public ModelAndView editProduct(@PathVariable int pid) {
		Product p=productService.getById(pid);
		return new ModelAndView("editproduct","prod",p);
		
	}
	
	@PostMapping("/updateProduct")
	public ModelAndView updateProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty, @RequestParam double price) {
		productService.updateProduct(new Product(pid,pname,qty,price));
		return new ModelAndView("redirect:/product/viewproducts");
	}
	
	@GetMapping("/deleteProduct/{pid}")
	public ModelAndView deleteProduct(@PathVariable int pid) {
		productService.deleteById(pid);
		return new ModelAndView("redirect:/product/viewproducts");
		
	}
	

}
