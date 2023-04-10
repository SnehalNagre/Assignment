package com.array;

import java.util.Arrays;

public class SecondHighDigit {
	public static void secondHigh(int[] ar)
	{
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>highest) 
			{
				shighest=highest;
				highest=ar[i];
			}
			if(ar[i]<highest && ar[i]>highest)
				shighest=ar[i];
		}
		System.out.println("second highest:" +shighest);
		
	}

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(ar));
		secondHigh(ar);
		

	}

}
