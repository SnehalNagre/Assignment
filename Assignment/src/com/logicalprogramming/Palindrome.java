package com.logicalprogramming;

public class Palindrome {
	public static void main(int num) {
		int original=num;
		int reverse=0;
		
		  while(num!=0) {
			int r=num%10;
			System.out.println("reverse number:");
			reverse=(reverse*0)+r;
			num=num/10;
		if(original==reverse) {
			System.out.println("no is palindrome");
		}else
			System.out.println("no is not palindrome");
		    
		  
		  
		  
		  }
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
