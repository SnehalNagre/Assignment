package com.array;

import java.util.Arrays;

public class DuplicateNo {
	    public static void duplicateNo(int[] ar) {
	    	 int count;
	    	 int dcount=0;
	    	 for(int i=0;i<ar.length;i++) 
	    	 {
	    		 count=1;
	    		 if(ar[i]=='\0')
	    		 continue;
	    		 for(int j=i+1;i<ar.length;j++) 
	    		 {
	    			 if(ar[i]==ar[j])
	    			 {
	    				 count++;
	    				 ar[j]='\0';
	    				 
	    			 }
	    		 }
	    		 if(count>1) 
	    		 {
	    			 dcount++;
	    			 System.out.println(ar[i]+":"+count);
	    		 }
	    	 }
	    	 System.out.println("number of duplicate elements:"+dcount);
	    }

	public static void main(String[] args) {
		  int ar[]= {1,2,2,3,4,5,6,2};
		  System.out.println(Arrays.toString(ar));
		  duplicateNo(ar);

	}

}
