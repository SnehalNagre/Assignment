package com.array;

import java.util.Arrays;

public class FrequencyNumber {
	    
	   public static void countFreq(int[] ar) 
	   {
		   int count;
		   for(int i=0;i<ar.length;i++)
		   {
			   count=1;
			   if(ar[i]=='\0')
			   continue;
			   for(int j=i+1;j<ar.length;j++) 
			   {
				   if(ar[i]==ar[j]) {
					   count++;
				   ar[j]='\0';
			   }
		   }
			
		   System.out.println(ar[i]+":"+count);
		   }
		
	   }

	
		public static void main(String[] args) 
		{
		  int ar[]= {1,2,4,2,5,7,7,4,3};
		  System.out.println(Arrays.toString(ar));
		  countFreq(ar);
		}

      
}

