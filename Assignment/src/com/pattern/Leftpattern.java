package com.pattern;

import java.util.Scanner;

public class Leftpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr rows:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=(n-1);j++) 
			{
				System.out.print("");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
