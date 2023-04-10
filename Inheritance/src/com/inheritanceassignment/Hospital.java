package com.inheritanceassignment;

public class Hospital extends Doctor {
	private String branch;
	
	Hospital()
	{
		super();
	}
	public Hospital(String name,String type,String exp,String branch)
	{
		super(name,type,exp);
		System.out.println("in costructor2");
		this.branch=branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String toString() 
	{
		return super.toString()+""+branch;
	}

}
