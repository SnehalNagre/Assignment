package com.array;

import java.util.Scanner;

public class Arraysumofeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		int sum=0;
		int sumEven=0;
		int sumOdd=0;
		
		System.out.println("enter the elements in array");
		
		for (int i=0;i<=ar.length;i++) 
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
			
			if(ar[i]%2==0) {
				sumEven=sumEven+ar[i];
			}else {
				sumOdd=sumOdd+ar[i];
				
			}
		}
		System.out.println("total:"+sum);
		System.out.println("sumEven:"+sumEven);
		System.out.println("sumOdd:"+sumOdd);
	}
}