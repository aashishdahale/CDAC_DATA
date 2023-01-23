package com.demo.test;

import java.util.Scanner;

import com.demo.service.AccountServiceImpl;

public class TestAccountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.println("Menu:\n1.Withdraw Amount\n2.Deposit Amount\n"
					+ "3.Check Balance\n4.Change pin num\n"
					+ "5.Open new account\n6.Exit");
			System.out.println("choice:");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter Account no:");
			int accno=scan.nextInt();
			System.out.println("Enter pin no:");
			int pin=scan.nextInt();
			System.out.println("Enter amount :");
			float amt=scan.nextFloat();
			AccountServiceImpl.withdrawAmt(accno,pin,amt);
			break;
			case 2:
				break;
			case 4:System.out.println("Enter accno:");
			accno=scan.nextInt();
			System.out.println("Enter old pin num");
			pin=scan.nextInt();
			System.out.println("Enter new pin no:");
			int newpin=scan.nextInt();
			
			boolean status=AccountServiceImpl.changePin(accno,pin,newpin);
			if(status)
			{
				System.out.println("Pin changed!!");
			}
			else
				System.out.println("Pin NOT changed!!");
			break;
			case 5:
				System.out.println("1.Saving\n2. Demat");
				int ch=scan.nextInt();
				AccountServiceImpl.createNewAccount(ch);
				
			case 6:System.out.println("Thank you for using the system!!");
			scan.close();	
			break;
			}
		}while(choice!=6);

	}

}
