package com.ifelse;

import java.util.Scanner;

public class Tableforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x" +i+"=" +(num*i));
		}

	}

}
