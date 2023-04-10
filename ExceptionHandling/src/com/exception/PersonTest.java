package com.exception;

import java.util.Scanner;

class Person
    {
    	private int id;
    	private String name;
    	private int age;
    	
    	Person(){}
    	Person(int id,String name,int age)
    	{
    		this.id=id;
    		this.name=name;
    		this.age=age;
    	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
   }
    public class PersonTest {
      static Scanner sc=new Scanner(System.in);
	  public static void main(String[] args) {
		
		    System.out.println("Enter age");
			int age=sc.nextInt();
			
			if(age<0) 
			{
				throw new ArithmeticException("age should be greater than 0");
			}
			else if(age<18) 
			{
				throw new ArithmeticException("you are not eligible for vote");
			}
			else {
				System.out.println("welcome to vote");
				 }	

    }
}
    
