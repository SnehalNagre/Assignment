package com.array;

public class Alternate1 {
	public static void printArray(int ar[])
	{
		for(int x:ar)
		{
			System.out.print(x+"");
		}
		System.out.println();
		
	}
	
	public static void alternate(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
		   if(i%2==0)
             System.out.print(ar[i]+" ");
		}
		
		System.out.println();
	}

    public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("before");
		printArray(ar);
		
		System.out.println("===============");
		alternate(ar);
		
	}

}
