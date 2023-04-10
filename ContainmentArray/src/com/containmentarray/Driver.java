package com.containmentarray;

public class Driver {
	private int id;
	private String name;
	
	Driver()
	{
		
	}
	Driver(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getname() 
	{
		return name;
	}
	public String toString() {
		return id+""+name;
	}

}
