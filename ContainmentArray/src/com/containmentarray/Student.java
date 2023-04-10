package com.containmentarray;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private float marks[];
	private float totalMarks;
	
	Student()
	{
		
	}
	Student(int id,String name,float marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getid() 
	{
		return id;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setMarks(float marks[]) {
		this.marks=marks;
	}
	public float[] getMarks() {
		return marks;
	}
	
   public float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

public String toString() {
	   return id+""+name+""+Arrays.toString(marks)+""+totalMarks;
   }


}
