package com.oops;

public class Employe {

	int id;  
	String name;
	float experience;
	double salary;
	int age;
	
	   

	   void enterDetails(int i,String n,float exp,double sal,int a) 
	   {
		   id=i;
		   name=n;
		   salary=sal;
		   experience=exp;
		   age=a;
	   }
	   void displayDetails() {
		   System.out.println(id+ " " +name+ " " +salary+ " " +experience+ " " +age);
		   
		   
	   }
	   void experience() {
		   
	   }

	public static void main(String[] args)
	 {
		Employe e=new Employe();
		e.enterDetails(10,"snehal", 20000, 2, 25);
		e.displayDetails();
		

	}

}
