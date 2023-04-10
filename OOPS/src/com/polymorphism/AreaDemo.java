package com.polymorphism;

public class AreaDemo {
	
	 void area(int side)
	 {
		System.out.println("square :" +(side*side));
		
	 }
	 void area(int length,int breadth) 
	 {
			System.out.println("rectangle :" +(length*breadth));
			
	 }
	 void area(float radius) 
	 {
			System.out.println("square :" +(3.14*radius*radius));
			
	 }

}
