package com.containmentarray;

public class Studentonstructor {

	public static void main(String[] args) {
		Student st[]=new Student[2];
		
		float m1[]= {45,60,70};
		st[0]=new Student(1,"abc",m1);
		
		float m2[]= {70,80,90};
		st[1]=new Student(2,"bcd",m2);
		
		for(Student s:st) {
			System.out.println(s);
		}
		

	}

}
