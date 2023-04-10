package com.encapsulation;

public class Supplier {
	 int id;
     String name;
	 String location;
	
	public Supplier(){
		System.out.println("default constructor");
	}
	Supplier(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	

}
