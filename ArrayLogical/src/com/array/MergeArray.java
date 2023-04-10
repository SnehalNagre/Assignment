package com.array;

import java.util.Arrays;

public class MergeArray {
	public static int[] mergearray(int [] ar1,int[]ar2) 
	{
		int size1=ar1.length;
		int size2=ar2.length;
		
		int marr[]=new int [size1+size2];
		int i,j;
		int k=0;
		for(i=0,j=0;i<size1&&j<size2;i++,j++) 
		{
			marr [k++]=ar1[i];
			marr [k++]=ar2[j];
		}
		while(i<size1) 
		{
			marr[k++]=ar1[i++];
		}
		while(i<size2) 
		{
			marr[k++]=ar2[i++];
		}
		
		System.out.println(Arrays.toString(marr));
		return marr;
		
	}

	public static void main(String[] args) {
		int ar1[]= {3,4,5,6};
		int ar2[]= {4,5,6,7,8,9};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		int[] mar= mergearray(ar1,ar2);

	}

}
