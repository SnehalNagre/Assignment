package com.containment;

import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc=new Scanner(System.in);
	 
	public static void main(String[] args) {
		Employee[] e=new Employee[1];
		
		for(int i=0;i<e.length;i++) 
		{
			e[i]=new Employee();
			enterDetails(e[i]);
			
		}
		entergetDetails(e);
	}
	public static void enterDetails(Employee e) 
	{
		System.out.println("enter employee id:");
		e.seteId(sc.nextInt());
		
		System.out.println("enter employee name:");
		e.seteName(sc.next());
		
		System.out.println("enter no of departments:");
		int dep=sc.nextInt();
		
		//Department[] dep1=new Department[2];
		e.setDepartment(new Department[dep]);
		
		for(int i=0;i<dep;i++) 
		{
		 e.getDepartment()[i]=new Department();
		 
		 System.out.println("enter dep id:");
		 e.getDepartment()[i].setDeptId(sc.nextInt());	
		 
		 System.out.println("enter dept name:");
		 e.getDepartment()[i].setDeptName(sc.next());
				 
		}
	}
	public static void entergetDetails(Employee[] emp) 
	{
		for(Employee e:emp) 
		{
			System.out.println("employee id:"+e.geteId()+" emp name:"
		    +e.geteName());
		for(Department d:e.getDepartment()) 
		{
			System.out.println(d);
		}
	}
}

}
