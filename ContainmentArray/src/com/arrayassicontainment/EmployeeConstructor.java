package com.arrayassicontainment;

public class EmployeeConstructor {
	

	public static void main(String[] args) {
		
		Department dp1=new Department(1,"Java");
		Department dp2=new Department(2,"Python");
		
		Employee emp[]=new Employee[3];
		emp[0]=new Employee(1,"neha",4000,dp1);
		emp[1]=new Employee(2,"shreya",5000,dp1);
		emp[2]=new Employee(3,"jiya",6000,dp2);
		
		for(Employee e:emp) {
			System.out.println(e);
		}

	}

}
