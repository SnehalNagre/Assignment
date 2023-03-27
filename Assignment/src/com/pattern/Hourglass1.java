package com.pattern;

import java.util.Scanner;

public class Hourglass1 {

	public static void main(String[] args) {
	  //reverse pyramid
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<i;j++) 
			{
				System.out.print("");
			}
			for(int j=1;j<=(n-1)+1;j++) {
				
			}
		}

	}

}
