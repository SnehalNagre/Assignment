package com.containment;

public class School {

	public static void main(String[] args) {
		Course c1=new Course(5,"python",10000);
		Course c2=new Course(10,"java",20000);
		
		Student s1=new Student(11,"aarav",23,new Course(10,"java",20000));
		System.out.println(s1);
		
		Student s2=new Student(12,"amey",24,c1);
		System.out.println(s2);
		
		s2.setCourse(c2);
		System.out.println(s2);
	}

}
