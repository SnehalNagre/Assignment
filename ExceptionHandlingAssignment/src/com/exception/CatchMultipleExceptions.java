package com.exception;

public class CatchMultipleExceptions {

	public static void main(String[] args) {
		try {
		int arr[]= {1,2,3};
		
		System.out.println(arr[3]);
		int result=10/0;
	}
     catch(ArrayIndexOutOfBoundsException e)
     {
    	System.out.println("ArrayIndexoutofBound:" +e); 
     }
	 catch(ArithmeticException e) 
		{
		 System.out.println("Arithmetic exception:" +e);
		}
	}

}
