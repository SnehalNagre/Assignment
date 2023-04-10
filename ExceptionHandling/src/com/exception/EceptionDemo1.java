package com.exception;

public class EceptionDemo1 {

	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		
		try {
			int sum=(x+y)/(x-y);
			System.out.println(sum);
		   }
		catch(Exception e) {
			System.out.println(e);
		}
		String str="Java";
		System.out.println(str);
		}

	}


