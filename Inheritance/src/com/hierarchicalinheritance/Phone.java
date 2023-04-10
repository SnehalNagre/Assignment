package com.hierarchicalinheritance;

public class Phone {
	private int id;
	private String phoneNo;
	private float bill;
	
	Phone()
	{
		
	}
	Phone(int id,String phoneNo,float bill)
	{
	  this.id=id;
	  this.phoneNo=phoneNo;
	  this.bill=bill;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	public void setPhoneNo(String phoneNo) 
	{
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo() 
	{
		return phoneNo;
	}
	public void setBill(float Bill) {
		this.bill=bill;
	}
	public String toString() 
	{
		return id+""+phoneNo+""+bill;
	}

}
