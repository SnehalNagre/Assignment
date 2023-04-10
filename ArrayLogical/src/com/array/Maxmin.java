package com.array;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		int ar[]=new int[5];
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
		    ar[i]=sc.nextInt();
			if(ar[i]>max)
				max= ar[i];
			if(ar[i]<min)
				min=ar[i];
		}
		
		System.out.print(min);
		System.out.println(max);
		

	}

}
