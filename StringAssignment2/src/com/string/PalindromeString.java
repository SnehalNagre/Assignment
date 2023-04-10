package com.string;

import java.util.Scanner;

public class PalindromeString {
	
	public static void palindrome(String st) {
	
		String rev ="";
	    
		for(int i=st.length()-1;i>=0;i--) 
		{
		    rev=rev+st.charAt(i);
	   }
	        System.out.println(rev);
	    
	        if(st.equals(rev)) 
	     {
		System.out.println("String is palindrome");
	     }
	     else {
		
	    	System.out.println("String is not palindrome");
     }
	}

   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String");
	    
	    String st=sc.next();
		
	    palindrome(st);
	}
	    
		}
