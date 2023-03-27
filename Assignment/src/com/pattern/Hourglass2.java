package com.pattern;

import java.util.Scanner;

public class Hourglass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			Scanner sc= new Scanner(System.in);	
			System.out.println("Enter rows:");
			int n= sc.nextInt();
				
			 // reverse pyramid
		    for(int i=1;i<=n;i++)
		    {
		   	 //for spaces
		   	 for(int j=1;j<i;j++)
		   	 {
		   		 System.out.print(" ");
		   	 }
		   	 
		   	 // for numbers
		   	 for(int j=1;j<=(n-i)+1;j++)
		   	 {
		   		 System.out.print("* ");
		   		 
		   	 }
		   	
		   	 System.out.println();
		   	

		    }

			//pyramid
		     for(int i=2;i<=n;i++)
		     {
		    	 for(int j=1;j<=(n-i);j++)
		    	 {
		    		 System.out.print(" ");
		    	 }
		    	 // for numbers 
		    	 for(int j=1;j<=i;j++)
		    	 {
		    		 System.out.print("* ");// extra space pyramid
		    	 }
		    	 
		    	 System.out.println();

		     }
		    
			}

		


	}


