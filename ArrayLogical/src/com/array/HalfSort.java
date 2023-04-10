package com.array;

import java.util.Arrays;

public class HalfSort {
	
	public static void halfsort(int[] ar) {
		int len=ar.length;
		int i,j,temp = 0;
		
		for(i=0;i<len/2;i++) 
		{
			for(j=i+1;j<len/2;j++) 
			{
				if(ar[i]>ar[j]) 
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
					
			}
		}
		//for descending order
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
	public static void printArray(int[] ar) 
	{
		for(int x:ar) 
		{
			System.out.print(x+"");
		}
		System.out.println();
	}
  
	public static void main(String[] args) {
		int ar[]= {2,4,3,5,7,6,8,9};
		
		System.out.println("before sort:");
		printArray(ar);
		
		System.out.println("=================");
		halfsort(ar);
		
		System.out.println("aftre sort:");
		printArray(ar);

	}

}
