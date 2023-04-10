package com.containmentassignment;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Dept dept;
	private MyDate mydate;
	
  Employee()
  {
	  
  }
  Employee(int id,String name,double salary,Dept dept,MyDate mydate)
  {
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  this.dept=dept;
	  this.mydate=mydate;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
public MyDate getMydate() {
	return mydate;
}
public void setMydate(MyDate mydate) {
	this.mydate = mydate;
}
  public String toString() 
  {
	  return id+""+name+""+salary+""+dept+""+mydate;
  }
}
