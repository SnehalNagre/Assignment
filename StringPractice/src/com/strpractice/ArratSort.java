package com.strpractice;

import java.util.Scanner;

public class ArratSort {
	static Scanner sc=new Scanner(System.in);
	public static void sortArray(int[] ar)
	{
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]= temp;
				}
			}
		}
	}
	public static void printArray(int[] ar) 
	{
		for(int x:ar) {
			System.out.print(x+ " ");
		}
		System.out.println();
	}
	

		

	public static void main(String[] args) {
    
       int arr[]= {7,6,5,9,4,3,2};
       System.out.println("before sort");
       printArray(arr);
       
       System.out.println("after sort");
       sortArray(arr);
       printArray(arr);
	}
}

     

