package com.containmentassignment;

public class DeptClass {
	private int id;
	private String name;
	
	DeptClass()
	{
		
	}
	DeptClass(int id,String name)
	{
		this.id=id;
		this.name=name;
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
	public String toString() 
	{
		return id+" "+name;
	}

}
