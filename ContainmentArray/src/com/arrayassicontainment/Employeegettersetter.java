package com.arrayassicontainment;

import java.util.Arrays;
import java.util.Scanner;



public class Employeegettersetter {
	static Scanner sc=new Scanner(System.in);
	/*public static void empDetails(Employee e) {
		
		
		System.out.println("enter emp id:");
		e.setEid(sc.nextInt());
		
		System.out.println("enter emp name:");
		e.setEname(sc.next());
		
		System.out.println("enter salary:");
		e.setSalary(sc.nextDouble());
		
		e.setDepartment(new Department());
		
		System.out.println("enter dept id:");
		e.getDepartment().setDid(sc.nextInt());
		
	}*/
	
	public static void highestSalary(Employee[] em) {
		double highest= Float.MIN_VALUE;
		Employee shigh= new Employee();
		for(Employee e:em)
		{
			if(e.getSalary()>highest)
			{	
				shigh=e;
				highest= e.getSalary();
			    
			}
		}
		System.out.println("========higher income===================");
		System.out.println(shigh);
	}
	public static void salarySort(Employee emp[]) {
		Employee e=new Employee();
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i+1;j<emp.length;j++) 
			{
				if(e.getSalary()>e.getSalary()) {
					e=emp[i];
					emp[i]=emp[j];
					emp[i]=e;
				}
			}
			
		}
		System.out.println(Arrays.toString(emp));
		
		
	}
	public static void deptwiseEmployee(Employee em[],Department dp[])
	{
		for(Department d:dp)
		{
			System.out.println(d.getDname());
			System.out.println("-----------------");
			for(Employee e:em) 
			{
				if(e.getDepartment().equals(d)) 
					System.out.print(e.getEname());
			}
			System.out.println();
			System.out.println("----------------------");
		}
	}
	public static void noOfEmployeeEachDept(Employee[] emp,Department[] dept) {
		int dcount;
		for(Department d:dept) 
		{
			dcount=0;
			System.out.println(d.getDname());
			System.out.println("=====================");
			for(Employee e:emp)
			{
				if(e.getDepartment().getDname().equals(d.getDname()))
				System.out.println(e.getDepartment().getDname()+"  ");
				dcount++;
			}
			System.out.println();
			System.out.println("Number of employee indepartment:" +dcount);
		}	
		
	
	}
	public static void main(String[] args) {
		Department dp[]=new Department[2];
		
		dp[0]=new Department(1,"Marketing");
		dp[1]=new Department(2,"Sales");
		
		Employee emp[]=new Employee[3];
		
		emp[0]=new Employee(101,"riya",40000,dp[0]);
		emp[1]=new Employee(102,"siya",80000,dp[1]);
		emp[2]=new Employee(103,"jiya",50000,dp[0]);
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("---deptwise employee----");
		deptwiseEmployee(emp,dp);
		
		
		highestSalary(emp);
		noOfEmployeeEachDept(emp,dp);
		
		salarySort(emp);
	}	
	      
}    
