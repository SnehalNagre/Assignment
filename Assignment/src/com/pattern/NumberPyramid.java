package com.pattern;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number:");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=(n-i);j++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<i;j++) {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
       }
	
     //reverse pyramid
      for(int i=2;i<=n;i++) {
	        for(int j=1;j<i;j++) {
		      System.out.print(" ");
	 }
	 for(int j=1;j<=(n-i)+1;j++) {
		 System.out.print("* ");
 
	     }
	 System.out.println();
    }
 
  }
}
