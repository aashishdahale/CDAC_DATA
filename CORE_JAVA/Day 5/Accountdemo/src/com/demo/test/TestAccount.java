package com.demo.test;

import com.demo.beans.*;

public class TestAccount {

	public static void main(String[] args) {
		DematAccount da = new DematAccount (11, "Parag", 
			"9999999999", 1234, 15000, 0.2f);
		
		da.withdraw(5000);
		System.out.println(da);
		da.withdraw(8000);
		System.out.println(da);
		
		SavingsAccount sa = new SavingsAccount (11, "Parag", 
				"9999999999", 1234, 15000, "ABCD1234");
			
			sa.withdraw(5000);
			System.out.println(sa);
			sa.withdraw(8000);
			System.out.println(sa);
	}
	


}
