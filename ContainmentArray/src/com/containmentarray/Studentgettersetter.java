package com.containmentarray;

import java.util.Scanner;

public class Studentgettersetter {
	
	static Scanner sc= new Scanner(System.in);

	public static void enterDetails(Student s)
	{
		System.out.println("Enter student id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter name:");
		s.setName(sc.next());
		
		float m[]= new float[3];
		
		System.out.println("Enter marks of 3 subjects:");
		for(int i=0;i<m.length;i++)
		{
			m[i]= sc.nextFloat();
			s.setTotalMarks(s.getTotalMarks()+m[i]);
		}
		
		s.setMarks(m);
		
	}
	
	public static void highestMarks(Student [] st)
	{
		float highest= Float.MIN_VALUE;
		Student shigh= new Student();
		for(Student s:st)
		{
			if(s.getTotalMarks()>highest)
			{	
				shigh=s;
				highest= s.getTotalMarks();
			    
			}	
		}
		
		System.out.println("========Topper===================");
		System.out.println(shigh);
	}
	
	public static void main(String[] args) {

      Student std[]= new Student[3];
       
      for(int i=0;i<std.length;i++)
      {
    	  std[i]= new Student();
    	  enterDetails(std[i]);
      }
         

       for(Student s:std)
       {
    	   System.out.println(s);
       }
       
       highestMarks(std);

	}

}

