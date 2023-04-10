package com.array;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ar[]=new int[5];
	int fact=1;
	System.out.println("enter array elements:");
	for(int i=0;i<ar.length;i++) 
	{
		ar[i]=sc.nextInt();
	     fact=fact*ar[i];
	}

	System.out.println("fact is:"+fact);

	}

}
