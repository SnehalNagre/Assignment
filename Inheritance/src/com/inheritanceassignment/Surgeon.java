package com.inheritanceassignment;

public class Surgeon {
	private String name;
	private String type;
	
	Surgeon()
	{
		
	}
	public Surgeon(String name,String type) 
	{
		this.name=name;
		this.type=type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString() 
	{
		return name+""+type;
	}

}
