package com.arrayobject;

import java.util.Scanner;

public class Studentgettersetter2 {

	public static void main(String[] args) {
		Student stud[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<stud.length;i++) 
		{
			stud[i]=new Student();
			
			System.out.println("enter id");
			stud[i].setId(sc.nextInt());
			
			System.out.println("enter name");
			stud[i].setName(sc.next());
			
			System.out.println("enter marks");
			stud[i].setMarks(sc.nextFloat());
		}
          for(Student s:stud) 
          {
        	  System.out.println(s);
        	  
          }
	}

}
