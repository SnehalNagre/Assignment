package com.containment;

public class Student {
	private int sid;
	private String sname;
	private int age;
	private Course course ;
	
	Student()
	{
		
	}
	Student(int sid,String sname,int age,Course course)
	{
		this.sid=sid;
		this.sname=sname;
		this.age=age;
		this.course=course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String toString() 
	{
	 return sid+" "+sname+" "+age+" "+course;	
	}
	

}
