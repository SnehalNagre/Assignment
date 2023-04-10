package com.containment;

public class Author {
	private int aid;
	private String aname;
	private int age;
	
	Author()
	{
		aname="unknown";
	}
	Author(int aid,String aname,int age )
	{
		this.aid=aid;
		this.aname=aname;
		this.age=age;
	}
	public void setAid(int id) 
	{
		this.aid=aid;
	}
	public int getAid() 
	{
		return aid;
	}
	public void setAname(String aname) 
	{
		this.aname=aname;
	}
	public String getAname() 
	{
		return aname;
	}
	public void setAge(int age) 
	{
		this.age=age;
	}
	public int getAge() 
	{
		return age;
	}
	public String toString() {
		return aid+""+aname+""+age;
	}
	
	}



