package com.array;


import java.util.Arrays;

public class FrequencyNo {
	public static void countFrequency(int ar[])
	{
		int count;
		for(int i=0;i<ar.length;i++) 
		{
			count=1;
			if(ar[i]=='\0')
			continue;
		     for(int j=i+1;j<ar.length;j++) 
		     {
			     if(ar[i]==ar[j]) 
			    {
				count++;
				ar[j]='\0';
			    }
		     }
		    System.out.println(ar[i]+":"+count);
	   }
		
	}
	
	public static void main(String[] args) {
		int ar[]= {5,6,7,1,2,6,6,5};
		System.out.println(Arrays.toString(ar));
		countFrequency(ar);

	}

}
