package com.logicalprogramming;

import java.util.Scanner;

public class GradingIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double marks = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of five subjects:");
		float sub1=sc.nextFloat();
		float sub2=sc.nextFloat();
		float sub3=sc.nextFloat();
		float sub4=sc.nextFloat();
		float sub5=sc.nextFloat();
		
		if(marks>=85) 
		{
			System.out.println("outstanding");
		}if(marks>=75) 
		{ 
			System.out.println("good");
		}
		else {
			System.out.println("invalid");
		}
			
}
}