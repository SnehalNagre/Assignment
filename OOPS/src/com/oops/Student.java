package com.oops;

public class Student {
	private int a;
	int b;
	public int c;
	  
	private void display() 
	{
		System.out.println("hello");
	}
	 void enter() 
	 {
		System.out.println("hi"); 
	 }
     public void system() 
     {
    	 System.out.println("bye");
     }

	public static void main(String[] args) {
		Student s=new Student();
		s.display() ;
		s.enter(); 
		s.system();

	}

}
