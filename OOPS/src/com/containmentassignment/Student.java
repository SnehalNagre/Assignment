package com.containmentassignment;

public class Student {
	private int rollNo;
	private String name;
	private DeptClass deptclass;
	
	Student()
	{
		
	}
	Student(int rollNo,String name,DeptClass deptclass)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.deptclass=deptclass;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DeptClass getDeptclass() {
		return deptclass;
	}
	public void setDeptclass(DeptClass deptclass) {
		this.deptclass = deptclass;
	}
	public String toString()
	{
	return rollNo+""+name+""+deptclass;	
	}

}
