package com.exception;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try {
		String str[]= {"Java","c",null,"python"};
		
		for(int i=0;i<=str.length;i++) 
		{
			System.out.println(str[i].length());
		}
		}
		catch(NullPointerException e) 
		{
			System.out.println(e);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
       
	}

}
