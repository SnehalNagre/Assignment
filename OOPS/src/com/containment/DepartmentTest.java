package com.containment;

import java.util.Scanner;

public class DepartmentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Department d=new Department();
		Employee e=new Employee();
		
		System.out.println("Enter dept id");
		d.setId(sc.nextInt());
		
		System.out.println("Enter dept name");
		d.setName(sc.next());
		
		System.out.println("Enter dept location");
		d.setLocation(sc.next());
		
		System.out.println("Enter employee id");
		e.setId(sc.nextInt());
		
		System.out.println("Enter employee name");
		e.setName(sc.next());
		
		System.out.println("Enter employee salary");
		e.setSalary(sc.nextFloat());
		
		e.setDept(d);
		System.out.println(e);
		
		
	}

}
