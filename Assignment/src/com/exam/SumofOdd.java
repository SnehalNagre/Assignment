package com.exam;

import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i,sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) 
		{
			if(i%2!=0) 
			{
				sum=sum+i;
			}
		
		}
		
		System.out.println("sum of odd no upto "+num+"="+sum);
	}

}
