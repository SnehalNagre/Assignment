package com.inheritanceassignment;

public class Car extends Vehicle {
	private int noWheels;
	private String name;
	
	Car()
	{
		
	}
	public Car(int id,String colour,int noWheels,String name) 
	{
		super(id,colour);
		System.out.println("in param constructor");
		this.noWheels=noWheels;
		this.name=name;
	}
	public int getNoWheels() {
		return noWheels;
	}
	public void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() 
	{
      return super.toString()+ "" +noWheels+ "" +name;
	}
}
	
	
