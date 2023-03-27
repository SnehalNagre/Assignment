package com.ifelse;

import java.util.Scanner;

public class nestedIfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float marks=sc.nextFloat();
		
		System.out.println("enter marks:" );
	if(marks>=65) {
		if(marks>=75) {
		System.out.println("you can take admission for science & commerce");
	}else {
		System.out.println("you can take only for commerce");
	    }
	}
		else {
		    System.out.println("you are not eligible");
	    }
	sc.close();
	}
	
}
