package com.demo.test;

import com.demo.beans.Coach;
import com.demo.beans.Player;
import com.demo.beans.Team;

public class TestAssociation {
public static void main(String[] args) {
 
 Player[] parr=new Player[12];
       Player p=new Player(10,"virat","Allrounder");
	parr[0]=new Player(10,"virat","Allrounder");
	parr[1]=new Player(11,"Ashwin","Allrounder");
	parr[3]=new Player(10,"Sachine","Allrounder");
	Coach c=new Coach(1,"Ganguli",23);
	Team t1=new Team(11,"Mumbai Indian",p,c,parr);
	
        System.out.println(t1);
	System.out.println("coach name"+t1.getC().getCname());
	System.out.println("player name"+t1.getP().getSpeciality());
	 
        for(Player p1: t1.getPlist())
	{
		System.out.println(p1);
	}
}
}
