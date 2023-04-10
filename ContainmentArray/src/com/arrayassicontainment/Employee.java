package com.arrayassicontainment;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private Department department;
	
	
     Employee()
	{
		
	}
	Employee(int eid,String ename,float salary,Department department)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.department=department;
	}
	public void setEid(int eid) 
	{
		this.eid=eid;
	}
	public int getEid() 
	{
		return eid;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setSalary(double salary) 
	{
		this.salary=salary;
	}
	public double getSalary() 
	{
		return salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String toString() {
		return eid+"  "+ename+"  "+salary+"  "+department;
	}

}
