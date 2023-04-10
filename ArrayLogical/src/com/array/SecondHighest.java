package com.array;

import java.util.Arrays;

public class SecondHighest {
	public static void secondHighest(int ar[])
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
			if(ar[i]<highest && ar[i]>shighest) 
			
				shighest=ar[i];
		}
			System.out.println("second highest:"+shighest);
		
	}
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(ar));
		secondHighest(ar);
		

	}

}
