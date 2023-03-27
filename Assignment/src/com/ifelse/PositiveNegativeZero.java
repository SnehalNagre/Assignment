package com.ifelse;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("number is positive:" +num);
		}else if(num<0) {
			System.out.println("number is negative:" +num);
		}else
			System.out.println("number is zero:" +num);
	}

}
