package com.containmentarray;

public class Author {
	private int aId;
	private String aName;
	
	Author()
	{
		
	}
	Author(int aId,String aName)
	{
		this.aId=aId;
		this.aName=aName;
	}
	public void setAid(int aId) {
		this.aId=aId;
	}
	public int getAid() {
		return aId;
	}
	public void setAname(String aName) {
		this.aName=aName;
	}
	public String getAName() {
		return aName;
	}
	public String toString() {
		return aId+""+aName;
	}

}
