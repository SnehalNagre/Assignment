package com.exception;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			
			String s[]= {"java","c","python"};
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i].length());
			}
		}
		catch(NullPointerException e) 
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
