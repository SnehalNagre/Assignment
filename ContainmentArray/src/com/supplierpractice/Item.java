package com.supplierpractice;

public class Item {
	private int id;
	private String name;
	private double unitPrice;
	
	
	Item()
	{
		
	}
	Item(int id,String name,double unitPrice)
	{
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		
	}
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name)
	{
         this.name=name;		
	}
	public String getName() 
	{
	   return name;	
	}
	public void setUnitPrice(double d) 
	{
		this.unitPrice=d;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public String toString() {
		return id+" "+name+" "+unitPrice;
		}
}
	


