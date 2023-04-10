package com.encapsulation;

public class Person {
   private String name;
   private int age;
   private String vote;
   
   Person(){
	   System.out.println("defult constructor");
   }
   
   Person(String name,int age,String vote)
   {
	   System.out.println("param cons:");
	   this.name=name;
	   this.age=age;
	   this.vote=vote;
   }
   public void getvoting()
   {
    System.out.println("check voting");
    this.checkvote();
   }
   public void checkvote() {
	   System.out.println("in checking");
	   if(this.age>=18)
		   this.vote="can vote";
	   else
		   this.vote="cannot vote";

   }
	
   public static void main (String args[]) 
   {
	   Person p=new Person();
	   Person p1=new Person("abc",18,"bcd");
	   p.checkvote();
	   
   }

}
