package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.service.CityServiceImpl;
import com.demo.service.CityService;

public class Test {

	public static void displayMap(Map <String,List<String>> cmap) {
		if(cmap!=null) {
			for(String s: cmap.keySet()) {
				System.out.println("City: "+s);
				List<String> lst = cmap.get(s);
				for(int i=0;i<lst.size();i++) {
					System.out.println((i+1)+". "+lst.get(i));
				}
				System.out.println("==============================");
			}
		}
		else System.out.println("Not Found!!");

	} 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		CityService css = new CityServiceImpl();

		do {
			System.out.println("1. Add new city"
					+ "\n2. Find trees from a city"
					+ "\n3. Find all cities with the given tree"
					+ "\n4. Add a new tree in the existing city"
					+ "\n5. Display all"
					+ "\n6. Display in sorted order of city names"
					+ "\n7. Display no. of trees in a city"
					+ "\n8. Remove a tree from the given city"
					+ "\n9. Remove a city"
					+ "\n10. Exit");
			System.out.println("Enter your choice: ");
			choice = scan.nextInt();
			switch(choice) {
			case 1: 
				boolean status;
				status = css.addNewCity();
				if(status) System.out.println("Added successfully");
				else System.out.println("Could not add the city!!");
				break;

			case 2:
				System.out.println("Enter the city name: ");
				String cname = scan.next();
				List<String> lst=css.findByCity(cname);
				if(lst!=null) {
					for(int i=0;i<lst.size();i++) {
						System.out.println((i+1)+". "+lst.get(i));
					}
					System.out.println("==============================");
				}
				else System.out.println("City not found!!");
				break;

			case 3:
				System.out.print("Please enter the tree name: ");
				String tname = scan.next();
				List<String> clist = css.findByTree(tname);
				if(clist!=null) {
					System.out.println(clist);
				}
				else System.out.println("No city has the tree!!");
				break;
			case 4:
				System.out.println("In which city you want to add??");
				cname=scan.next();
				System.out.println("Which tree you want to add??");
				tname=scan.next();
				status=css.updateCity(cname,tname);
				if(status) {
					System.out.println("City Updated"); 
				}
				else
					System.out.println("Not updated");
				break;
			case 5:
				Map<String, List<String>> cmap=css.displayAll();
				displayMap(cmap);
				break;
			case 6:
				cmap=css.getSortedMap();
				displayMap(cmap);
				break;
			case 7:
				System.out.println("Enter city name:");
				cname=scan.next();
				int num=css.findCountOfTree(cname);
				if(num!=0) {
					System.out.println("Number of trees are:"+num);
				}
				else
					System.out.println("City Not Found!!");
				break;
			case 8:
				System.out.println("City name:");
				cname=scan.next();
				System.out.println("Enter Tree name:");
				tname=scan.next();
				status=css.deleteTree(cname,tname);
				if(status) {
					System.out.println("Tree deleted successfully!!");
				}else System.out.println("Not Found");
				break;
			case 9:
				System.out.println("Enter city name to remove:");
				cname=scan.next();
				status=css.deleteCity(cname);
				if(status) {
					System.out.println("City deleted successfully!!");
				}else System.out.println("Not Found");

				break;
			case 10:
				System.out.println("Thank you for visiting!!");
				scan.close();
				break;
			}
		}while(choice!=10);
	}

}
