package com.exception;

public class ThrowExceptionFially {

	public static void main(String[] args) {
		try {
			throw new Exception("exception thrown from try block");
		}
		catch(Exception e) 
		{
		  System.out.println("catch block:" +e);	
		}
		finally {
			System.out.println("finally block executed");
		}

	}

}
