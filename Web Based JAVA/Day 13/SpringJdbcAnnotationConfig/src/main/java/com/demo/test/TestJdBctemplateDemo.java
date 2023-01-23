package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJdBctemplateDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService pservice=(ProductService)ctx.getBean("productServiceImpl");
		do {
			System.out.println("1. add new product\n 2. delete product by id\n 3. display all\n"
					+ "4. display by id\n5. update product\n6. display by price\n7. exit");
			System.out.println("choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				int n=pservice.addnewProduct();
				if(n>0) {
					System.out.println("added successfully");
				}
				else {
					System.out.println("not added");
				}
				break;
			case 2:
				System.out.println("enter pid");
				int pid=sc.nextInt();
				n=pservice.deleteById(pid);
				if(n>0) {
					System.out.println("deleted successfully");
				}
				else {
					System.out.println("not deleted");
				}
				break;
			case 3:
				List<Product> plist=pservice.displayAll();
				plist.forEach(x->{System.out.println(x);});
				break;
			case 5:
				System.out.println("enter pid");
				pid=sc.nextInt();
				System.out.println("enter qty");
				int qty=sc.nextInt();
				System.out.println("enter price");
				double price=sc.nextDouble();
				n=pservice.updateById(pid,qty,price);
				if(n>0) {
					System.out.println("updated successfully");
				}
				else {
					System.out.println("not updated");
				}
				break;
			case 4:
				System.out.println("enter pid");
				pid=sc.nextInt();
				Product p=pservice.displayById(pid);
				System.out.println(p);
				break;
			case 6:
				System.out.println("enetr price");
				price=sc.nextDouble();
			    plist=pservice.displayByPrice(price);
				plist.forEach(x->{System.out.println(x);});
				break;
			case 7:
				System.out.println("Thank you for visiting");
				((ClassPathXmlApplicationContext)ctx).close();
				break;
			default:
				System.out.println("wrong choice");
			}
			
		}while(choice!=7);

	}

}
