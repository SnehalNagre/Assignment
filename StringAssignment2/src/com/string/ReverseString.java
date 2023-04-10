package com.string;

public class ReverseString {

	public static void reverseStr(String st) 
	{
		String revst="";
		
		for(int i=st.length()-1;i>=0;i--) 
		{
			revst=revst+st.charAt(i);
		}
		System.out.println(revst);
		
	}
	public static void main(String [] args) {
		String str="communication";
		
		System.out.println(str);
		reverseStr(str);
	}
}