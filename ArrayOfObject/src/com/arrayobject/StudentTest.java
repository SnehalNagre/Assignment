package com.arrayobject;

public class StudentTest {

	public static void main(String[] args) {
		Student st[]=new Student[5];
		st[0]=new Student(1,"name",60);
		st[1]=new Student(2,"name",50);
		st[2]=new Student(3,"name",70);
		st[3]=new Student(4,"name",80);
		st[4]=new Student(5,"name",90);
		
		for(Student s:st)
		{
			System.out.println(s);
		}

	}

}
