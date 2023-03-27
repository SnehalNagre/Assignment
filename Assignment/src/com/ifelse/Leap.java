package com.ifelse;

import java.util.Scanner;

public class Leap {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year:");
		
		int year=sc.nextInt();
		
		if((year%4)==0) 
			System.out.println("year is leap");
		else
			System.out.println("year is not leap");
		
	}

}
