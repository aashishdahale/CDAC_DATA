package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/viewProduct")
	public ModelAndView displayAll() {
		
		List<Product> plist=productService.displayAll();
		
		return new ModelAndView("displayallProduct","plist",plist);
		
	}
	
	@GetMapping("/addproduct")
	public String addproductformdisplay() {
		return "addproduct";
	}
	
	@PostMapping("/insertProduct")
	public ModelAndView insertProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam double price) {
		productService.addnewProduct(new Product(pid,pname,qty,price));
		return new ModelAndView("redirect:/product/viewProduct");
		
	}
	

}
