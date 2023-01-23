package com.demo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class User implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean,ApplicationContextAware{
  private int uid;
  private String name;
  private double amt;
public User() {
	super();
}
public User(int uid, String name, double amt) {
	super();
	this.uid = uid;
	this.name = name;
	this.amt = amt;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAmt() {
	return amt;
}
public void setAmt(double amt) {
	this.amt = amt;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", name=" + name + ", amt=" + amt + "]";
}
public void setBeanName(String name) {
	System.out.println("in Bean name aware "+name);
	
	
}
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	System.out.println("in BeanFactory aware "+beanFactory);
	
}
public void afterPropertiesSet() throws Exception {
	System.out.println("in initializingBean afterPropertiesSet");
	
}
public void myinit() {
	amt=100*340;
	System.out.println("in myinit method"+amt);
}
public void destroy() throws Exception {
	System.out.println("In disposable destroy");
	
}
public void mydestroy() {
	
	System.out.println("in mydestroy method");
}
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	System.out.println("in setApplicationContext"+applicationContext);
	
}

  
}
