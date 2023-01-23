package com.demo.beans;

public class Coach {
private int cid;
 private String cname;
 private int experience;
 
 public Coach() {
	super();
}

public Coach(int cid, String cname, int experience) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.experience = experience;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

@Override
public String toString() {
	return "Coach [cid=" + cid + ", cname=" + cname + ", experience=" + experience + "]";
}


 
}
