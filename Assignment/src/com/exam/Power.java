package com.exam;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pow;
		Scanner sc=new Scanner(System.in);
         System.out.println("enter base:");
         int base=sc.nextInt();
         
         System.out.println("enter expo");
         int expo=sc.nextInt();
         
         pow=Math.pow(base,expo);
         System.out.println(base+ "to the power" +expo+ "is:"+pow);
         
	}

}
