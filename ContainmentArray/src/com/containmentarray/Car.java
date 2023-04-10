package com.containmentarray;

import java.util.Arrays;

public class Car {
	private int cid;
	private String cname;
	private Driver driver[];
	
	Car()
	{
		
	}
	Car(int cid,String cname,Driver driver[])
	{
		this.cid=cid;
		this.cname=cname;
		this.driver=driver;
	}
	public void setCid(int cid) 
	{
		this.cid=cid;
	}
	public int getCid() 
	{
		return cid;
	}
	public void setCname(String cname) 
	{
		this.cname=cname;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setDriver(Driver driver[]) 
	{
		this.driver=driver;
	}
	public Driver[] getDriver() {
		return driver;
	}
	public String toString() 
	{
		return cid+""+cname+""+Arrays.toString(driver);
	}

}
