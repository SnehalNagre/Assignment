package com.array;

import java.util.Arrays;

public class Scdhigh {
	public static void scondhigh(int[] ar)
	{
		int highest=Integer.MIN_VALUE;
	    int shighest=Integer.MIN_VALUE;
	    
	    for(int i=0;i<ar.length;i++) 
	    {
	    	if(ar[i]>highest) {
	    		shighest=highest;
	    		highest=ar[i];
	    	}
	    	if(ar[i]<highest && ar[i]>highest)
	    		shighest=ar[i];
	    }
	    System.out.println("seconf highest is:"+shighest);
	}

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(ar));
		scondhigh(ar);

	}

}
