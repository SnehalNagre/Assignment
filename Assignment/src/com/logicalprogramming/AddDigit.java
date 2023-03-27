package com.logicalprogramming;

import java.util.Scanner;

public class AddDigit {
	public static void add(int num) {
		System.out.println("the digits are:");
	       while(num!=0) {
		      int r=num%10;
		      System.out.println(r);
		      num=num/10;
	}
	 System.out.println("");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        add(num);
        
	}

}
