package com.ifelse;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);			
		System.out.println("enter weight:");
		float weight=sc.nextFloat();
		
		System.out.println("enter height:");
		float height=sc.nextFloat();
		
		height=(float) (height*0.3048);
		
		float bmi=weight/height*height;
		System.out.println("your bmi is:" +bmi);
		
		if(bmi<=20) {
			System.out.println("underweight");
		}else if(bmi<=30) {
			System.out.println("normal");
		}else
			System.out.println("obes");
		
		
	}

}
