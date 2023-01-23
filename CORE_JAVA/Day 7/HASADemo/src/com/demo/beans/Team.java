package com.demo.beans;

import java.util.Arrays;

public class Team {
private int tid;
private String name;
private Player p;
private Coach c;
private Player[] plist;
public Team() {
	super();
}

public Team(int tid, String name, Player p, Coach c, Player[] plist) {
	super();
	this.tid = tid;
	this.name = name;
	this.p = p;
	this.c = c;
	this.plist = plist;
}







public Player[] getPlist() {
	return plist;
}

public void setPlist(Player[] plist) {
	this.plist = plist;
}

public Coach getC() {
	return c;
}



public void setC(Coach c) {
	this.c = c;
}



public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Player getP() {
	return p;
}
public void setP(Player p) {
	this.p = p;
}

@Override
public String toString() {
	return "Team [tid=" + tid + ", name=" + name + ", p=" + p + ", c=" + c + ", plist=" + Arrays.toString(plist) + "]";
}

}
