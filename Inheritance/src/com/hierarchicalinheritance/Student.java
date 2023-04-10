package com.hierarchicalinheritance;

public class Student {
	private int id;
	private String name;
	private double fees;
	private float marks;
	
	Student()
	{
		
	}
	Student(int id,String name,double fees,float marks)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
		this.marks=marks;
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String toString() 
	{
		return id+""+marks+""+fees+""+marks;
	}
}
