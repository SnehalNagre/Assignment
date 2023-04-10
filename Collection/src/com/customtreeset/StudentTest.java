package com.customtreeset;

import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		
		TreeSet<Student> set=new TreeSet<>();
		set.add(new Student(101,"Sneha",75f));
		set.add(new Student(102,"Siya",78f));
		set.add(new Student(103,"Shraddha",65f));

		for(Student s: set) {
			System.out.println(s);
			
		}
	}

}
