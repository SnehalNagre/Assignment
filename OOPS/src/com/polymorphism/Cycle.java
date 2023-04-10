package com.polymorphism;

public class Cycle {
	int accNo;
	int noWheels;
	
	public Cycle(int accNo,int noWheels)
	{
		this.accNo=accNo;
		this.noWheels=noWheels;
	}
    public void setAccNo(int accNo)
    {
    	this.accNo=accNo;
    }
    public int getAccNo() 
    {
    	return accNo;
    }
    public void setNoWheels(int noWeels)
    {
    	this.noWheels=noWheels;
    }
    public int getNoWheels() 
    {
    	return noWheels;
    }
}
