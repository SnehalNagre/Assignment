package com.inheritanceassignment;

public class Doctor extends Surgeon {
	private String exp;
	
	Doctor()
	{
		
	}
	Doctor(String name,String type,String exp)
	{
		super(name,type);
		System.out.println("in param constructor");
		this.exp=exp;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String toString() 
	{
		return super.toString()+""+exp;
	}

}
