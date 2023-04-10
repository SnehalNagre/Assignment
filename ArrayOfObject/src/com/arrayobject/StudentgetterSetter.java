package com.arrayobject;

import java.util.Scanner;

public class StudentgetterSetter {
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetails(Student s) {
		System.out.println("enter id:");
		s.setId(sc.nextInt());
		
		System.out.println("enter name:");
		s.setName(sc.next());
		
		System.out.println("enter marks:");
		s.setMarks(sc.nextFloat());
		
	}
	public static void printdetails(Student st[]) 
	{
		for(Student s:st) 
		{
			System.out.println(s);
		}
	}


	public static void main(String[] args) {
		Student stud[]=new Student[3];
		for(int i=0;i<stud.length;i++) 
		{
			stud[i]=new Student();
			enterDetails(stud[i]);
		}
        printdetails(stud);
	}

}
