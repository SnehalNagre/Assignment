package com.array;

import java.util.Arrays;

public class UniqueElemnts {
	  public static void uniqueElements(int[] ar){
		  
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
			  if(count==1)
			  {
				 System.out.println(ar[i]+":"+count); 
			  }
			   
		   }
	  }

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,2,3,4,};
		System.out.println(Arrays.toString(ar));
		uniqueElements(ar);

	}

}
