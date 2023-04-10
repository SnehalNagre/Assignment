package com.exception;

import java.util.Scanner;

public class BinaryNumberException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number:");
		
		int num=sc.nextInt();
		
		while(num>0) {
			if((num%10!=1)&&(num%10!=0)) 
			{
				throw new ArithmeticException("not a binary number");
			}
			num/=10;
		}
		System.out.println("no is binary");

	}

}
