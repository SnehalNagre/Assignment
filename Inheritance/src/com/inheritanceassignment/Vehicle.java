package com.inheritanceassignment;

public class Vehicle {
	private int id;
	private String colour;
	
	public Vehicle()
	{
		
	}
	public Vehicle(int id,String colour) 
	{
		this.id=id;
		this.colour=colour;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setName(String name) {
		this.colour = name;
	}
	public String toString()
	{
		return id+ "" +colour;
	}

}
