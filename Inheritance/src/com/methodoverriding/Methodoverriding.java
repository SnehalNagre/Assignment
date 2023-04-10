package com.methodoverriding;

class Person
{
	void display() 
	{
		System.out.println("in person");
	}
}
class Employee extends Person 
{
	void display() 
	{
		System.out.println("in employee");
	}
}
class Celebrity extends Person
{
	void display() 
	{
		System.out.println("in person");
	}
}



public class Methodoverriding {

	public static void main(String[] args) {
		Person p=new Person();
		p.display();
	}

}
