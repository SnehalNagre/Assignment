package com.containmentassignment;

public class College {

	public static void main(String[] args) {
		DeptClass d1=new DeptClass(1, "sneha");
		DeptClass d2=new DeptClass(2, "snehal");
		
		Student s1=new Student(3, "sia", d1);
		Student s2=new Student(4, "dia", d2);
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
