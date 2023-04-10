package com.containment;

public class Department {
	private int deptId;
	private String deptName;

	Department(){}
	
	Department(int deptId,String deptName)
	{
		this.deptId=deptId;
		this.deptName=deptName;
		
	}
	public void setDeptId(int deptId) 
	{
		this.deptId=deptId;
	}
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getdeptId() {
		return deptId;
	}
	public String toString() {
		return deptId+" "+deptName;
	}
}
