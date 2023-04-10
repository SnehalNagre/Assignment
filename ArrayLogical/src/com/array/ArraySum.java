package com.array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ar[]=new int[5];
		int sum=0;
		
		System.out.println("enter array elements:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			sum+=ar[i];
		
		}
      System.out.println(sum);
     
	}

}
