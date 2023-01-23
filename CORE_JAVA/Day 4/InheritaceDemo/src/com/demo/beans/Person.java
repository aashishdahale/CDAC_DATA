package com.demo.beans;

 public class Person {
   private int id;
   private String name;
   private String email;
   public Person() {
	   System.out.println("in person default constructor");
	   id=0;
	   name=null;
	   email=null;
   }
  
   public Person(int id, String name,String email) {
	   System.out.println("in person parametrized constructor");
	   this.id=id;
	   this.name=name;
	   this.email=email;;
   }
   ///setter and Getter
   public void setId(int id) {
	   this.id=id;
   }
   public void setName(String nm) {
	   this.name=nm;
   }
   public void setEmail(String em) {
	   this.email=em;
   }
   public int getId() {
	   return id;
   }
   public String getName() {
	   return name;
   }
   public String getEmail() {
	   return email;
   }
   public String toString() {
	   return "Id : "+id+" Name : "+name+ " email: "+email;
   }
}
