package com.ifelse;

import java.util.Scanner;

public class TrenaryEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks:");
		float marks=sc.nextFloat();
		
		System.out.println("enter marks of best three:");
		float bestthree=sc.nextFloat();
		
		System.out.println((marks>85 || bestthree>75)? "is eligible" : "not eligible");

	}

}
