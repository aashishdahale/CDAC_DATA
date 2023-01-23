package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Player;
import com.demo.beans.Team;
import com.demo.service.TeamService;
import com.demo.service.TeamServiceImpl;

public class TestTeamArray {

	public static void main(String[] args) {
		int choice=0;
		TeamService ts=new TeamServiceImpl();
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1. create a new team\n 2. Find given speciality from all teams\n");
		System.out.println("3. find given speciality from given team\n 4. Find team by captain\n");
		System.out.println("5. Find by coach\n 6. display all teams\n 7.exit\nchoice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			ts.createNewTeam();
			break;
		case 2:
			System.out.println("enter speciality to search");
			String sp=sc.next();
			Player[] plist=ts.findSpecialityAllTeams(sp);
			if(plist!=null) {
				for(Player p:plist) {
					System.out.println(p);
				}
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enter team name");
			sc.nextLine();
			String tname=sc.nextLine();
			System.out.println("enter speciality to search");
			sp=sc.next();
			
			plist=ts.getBySpeciality(tname,sp);
			if(plist!=null) {
				for(Player p:plist) {
					System.out.println(p);
				}
			}
			else {
				System.out.println("not found");
			}
			break;
		case 4:System.out.println("enter captain name");
			String cname=sc.next();
			Team t=ts.getByCaptain(cname);
			if(t!=null) {
				System.out.println(t);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 5:System.out.println("enter coach name");
			String coach=sc.next();
			t=ts.getByCoach(coach);
			if(t!=null) {
				System.out.println(t);
			}
			else {
				System.out.println("not found");
			}
			break;
		case 6:
			Team[] tlist=ts.displayallteams();
			for(Team t1:tlist) {
				if(t1!=null) {
				 System.out.println(t1);
				}else {
					break;
				}
			}
			break;
		case 7:
			System.out.println("thank you for visiting......");
			sc.close();
			break;
		}
		}while(choice!=7);
		
	}

	
}
