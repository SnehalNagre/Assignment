package com.ifelse;

import java.util.Scanner;

public class Thirdangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two angles:");
		int first=sc.nextInt();
		int second=sc.nextInt();
		int third;
		
		third=180-(first+second);
		System.out.println("enter third angle:" +third);

	}

}
