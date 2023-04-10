package com.containment;

import java.util.Arrays;

public class Employee {
	private int eId;
	private String eName;
	private Department[] department;
	
	Employee(){}
	
	Employee(int eId,String eName,Department[] department)
	{
		this.eId=eId;
		this.eName=eName;
		this.department=department;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	public void setDepartment(Department[] department) {
		this.department=department;
	}
	public Department[] getDepartment() {
		return department;
	}
   public String toString() {
	   return eId+" "+eName+" "+Arrays.toString(department);
   }
}
