package com.array;

import java.util.Arrays;

public class Halfsrt {
	public static void halfsort(int[] ar) {
	
        int len=ar.length;
		int i,j,temp=0;
		for(i=0;i<len/2;i++) 
		{
			for(j=i+1;j<len/2;j++) 
			{
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
			
		}
		//descending order
		for(i=len/2;i<len;i++)
		{
			for(j=i+1;j<len;j++) 
			{
				if(ar[i]<ar[j]) 
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		
	}	
	public static void printArray(int [] ar) 
	{
		for(int x:ar)
		{
			System.out.print(ar);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int ar[]= {2,3,5,4,7,6,8,9};
		System.out.println("before");
		printArray(ar);
		
		System.out.println("==============");
		halfsort(ar);
		
		System.out.println("after");
		printArray(ar);

	}

}
