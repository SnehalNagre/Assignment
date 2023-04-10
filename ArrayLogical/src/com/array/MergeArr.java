package com.array;

import java.util.Arrays;

public class MergeArr {
	public static int[] mergeArray(int[] ar1,int[] ar2) 
	{
		int size1=ar1.length;
		int size2=ar2.length;
		
		int marr[]=new int[size1+size2];
		int i,j;
		int k=0;
		for(i=0,j=0;i<size1&&j<size2;i++,j++) 
		{
			marr [k++]=ar1[i++];
			marr [k++]=ar2[j++];
		}
		while(i<size1) {
			marr [k++]=ar1[i++];
		}
		while(i<size2) {
			marr [k++]=ar2[i++];
		}
		System.out.println(Arrays.toString(marr));
		return marr;
	}	
	public static void main(String[] args) {
	   int ar1[]= {10,20,30};
	   int ar2[]= {1,2,3,4,5};
	   System.out.println();
	   System.out.println();
	   int marr[]=mergeArray(ar1,ar2);
	   
	}

	

}
