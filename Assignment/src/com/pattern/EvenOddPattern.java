package com.pattern;

import java.util.Scanner;

public class EvenOddPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) { 
			for(int j=1;j<=n;j++){
				if(i%2==0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				   }
			}
			  System.out.println();
		   
			
		   }

	}

}
