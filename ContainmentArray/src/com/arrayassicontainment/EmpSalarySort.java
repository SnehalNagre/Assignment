package com.arrayassicontainment;

import java.util.Scanner;



public class EmpSalarySort {
	static Scanner sc=new Scanner(System.in);
	
	public static void empDetails(Employee[] e) {
		for(int i=0;i<e.length;i++) {
			e[i]=new Employee();
		
		
		System.out.println("enter emp id:");
		e[i].setEid(sc.nextInt());
		
		System.out.println("enter emp name:");
		e[i].setEname(sc.next());
		
		System.out.println("enter salary:");
		e[i].setSalary(sc.nextFloat());
		}
	}
	public static void printEmpDetails(Employee em[])
	{
		System.out.println("=================================");
		for(Employee e:em)
		{
			System.out.println(e);
			
		}
	}
	public static void salarytSort(Employee[] em) 
	{
		Employee e=new Employee();
		for(int i=0;i<em.length;i++)
		{
			for(int j=i+1;j<em.length;j++)
			{
				if(em[i].getSalary()>em[j].getSalary()) 
				{
					e=em[i];
					em[i]=em[j];
					em[j]=e;
				}
					
			}
		}
		
	}
	public static void main(String[] args) {
		Employee emp[]=new Employee[2];
		 empDetails(emp);
		 
		 printEmpDetails(emp);
		 
		 salarytSort(emp);
		 
		 
	}

}
