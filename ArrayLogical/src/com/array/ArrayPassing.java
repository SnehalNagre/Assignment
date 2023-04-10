package com.array;

import java.util.Scanner;

public class ArrayPassing {
	
	private static void change(int[] arr) 
	{
		for(int i=0;i<=arr.length;i++)
		{
			arr[i]=arr[i]+arr[i];
		}
		for(int i=0;i<=arr.length;i++)
		{
			System.out.print(arr[i]+"");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int ar[]=new int[5];
	  System.out.println("enter array element:");
	  
	  for(int i=0;i<=ar.length;i++)
	  {
		  ar[i]=sc.nextInt();
	  }
	    change(ar);
	    System.out.println("original array");
	       for(int i=0;i<=ar.length;i++) {
	    	   System.out.print(ar[i]+"");
	       }
           System.out.println();
}

}


	