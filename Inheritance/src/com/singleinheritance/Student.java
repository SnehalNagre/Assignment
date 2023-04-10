package com.singleinheritance;

public class Student extends Person {
	private String school;
	private float marks;
   
	 
    Student()
	{
		
	}
	public Student(int id,String name,String school,float marks) 
	{
		super(id,name);
		System.out.println("parameterized constructor");
		this.school=school;
		this.marks=marks;
	}
	public String toString() 
	{
		return super.toString()+""+school+""+marks;
	}
}
