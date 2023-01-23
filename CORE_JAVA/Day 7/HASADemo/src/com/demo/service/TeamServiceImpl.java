package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Coach;
import com.demo.beans.Player;
import com.demo.beans.Team;

public class TeamServiceImpl  implements TeamService{
	static Team[] tlist;
	static int count;
	static {
		tlist=new Team[10];
		tlist[0]=new Team();
		tlist[0].setTid(1);
		tlist[0].setName("CSK");
		tlist[0].setC(new Coach(11,"StephenFleming",25));
		tlist[0].setP(new Player(100,"dhoni","allrounder"));
		Player[] plist= {new Player(110,"Rohit","batsman"),
				new Player(111,"Ishan","allrounder"),
				new Player(112,"Sam","bowler"),
				new Player(113,"jadeja","bowler"),new Player(114,"Raina","allrounder"),
				};
		tlist[0].setPlist(plist);
		tlist[1]=new Team();
		tlist[1].setTid(2);
		tlist[1].setName("Mumbai Indians");
		tlist[1].setC(new Coach(22,"Sachin",25));
		tlist[1].setP(new Player(200,"Virat","allrounder"));
		Player[] plist1= {new Player(121,"Yuvraj","allrounder"),
				new Player(122,"Harbhajan","bowler"),
				new Player(123,"Ashwin","bowler"),
				new Player(124,"Suryakumar","bowler"),new Player(125,"dinesh","batsman"),
				};
		tlist[1].setPlist(plist);
		
		count=2;
	}
	@Override
	public void createNewTeam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teamid");
		int tid=sc.nextInt();
		System.out.println("enter teamname");
		sc.nextLine();
		String tname=sc.nextLine();
		//create captain objet
		System.out.println("enter captain details");
		System.out.println("enter captain id");
		int cid=sc.nextInt();
		
		System.out.println("entercaptain name");
		String cname=sc.next();
		System.out.println("entercaptain specialty");
		String sp=sc.next();
		Player captain=new Player(cid,cname,sp);
		//create coach object
		System.out.println("enter coach details");
		cid=sc.nextInt();
		System.out.println("enter coach name");
		cname=sc.next();
		System.out.println("enter coach experience");
		int num=sc.nextInt();
		Coach coach=new Coach(cid,cname,num);
		//enetr player details
		Player[] plist=new Player[5];
		for(int i=0;i<plist.length;i++) {
			System.out.println("enter palyer id");
			int pid=sc.nextInt();
			System.out.println("enter player name");
			String pname=sc.next();
			System.out.println("enter player specialty");
			sp=sc.next();
			plist[i]=new Player(pid,pname,sp);
		}
		tlist[count]=new Team(tid,tname,captain,coach,plist);
		count++;
	}
	@Override
	public Team[] displayallteams() {
		return tlist;
	}
	@Override
	public Player[] findSpecialityAllTeams(String sp) {
		Player[] plist=new Player[10];
		int i=0;
		
		for(Team t:tlist) {
			if(t!=null) {
				for(Player p:t.getPlist()) {
					if(p.getSpeciality().equals(sp)) {
						plist[i]=p;
						i++;  
					}
					
				}
			}
			
		}
		if(i!=0) {
		return  plist;
		}
		else {
			return null;
		}
	}
	private Team searchTeamByName(String tname) {
		for(Team t:tlist) {
			if(t!=null) {
				if(t.getName().equals(tname)) {
					return t;
				}
			}
		}
		return null;
	}
	
	@Override
	public Player[] getBySpeciality(String tname, String sp) {
		
		Team t=searchTeamByName(tname);
		if(t!=null) {
			Player[] plist=new Player[10];
			int i=0;
			for(Player p:t.getPlist()) {
				if(p.getSpeciality().equals(sp)) {
					plist[i]=p;
					i++;  
				}
			}
			if(i>0) {
			  return plist;
			}
			
		}
		return null;
	}
	@Override
	public Team getByCaptain(String cname) {
		for(Team t:tlist) {
			if(t!=null) {
				System.out.println(t.getName());
				System.out.println("Captain name"+t.getP().getPname());
				if(t.getP().getPname().equals(cname)) {
					return t;
				}
			}
		}
		return null;
	}
	@Override
	public Team getByCoach(String coach) {
		for(Team t:tlist) {
			if(t!=null) {
				if(t.getC().getCname().equals(coach)) {
					return t;
				}
			}
		}
		return null;
	}

}
