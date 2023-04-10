package com.array;

import java.util.Scanner;

public class ReplacenoArray {
	static Scanner sc=new Scanner(System.in);
	
	public static void enterArray(int ar[]) {
		System.out.println("enter array element:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	}
	public static void printArray(int arr[]) 
	{
		for(int x:arr) 
		{
			System.out.print(x+"");
		}
		System.out.println();
	}
	public static void replace(int ar[])
	{
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0)
			 ar[i]=0;	
		}
	}
	

	public static void main(String[] args) {
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Before:");
		printArray(arr);
		
		replace(arr);
		
		System.out.println("after:");
		printArray(arr);
		
		
	 
	 

	}

}
