package com.ifelse;

import java.util.Scanner;

public class Divisiblebyfiveoreleven {
	public static void main(String args[]) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number divisible by 5 & 11:");
		num = sc.nextInt();
		
		if(num%5==0 || num%11==0){
			System.out.println("num is divisible by 5  :");
		}else 
			System.out.println("num is divisible by 11 :");
		
  }
}
