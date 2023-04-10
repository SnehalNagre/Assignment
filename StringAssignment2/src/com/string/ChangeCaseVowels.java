package com.string;

import java.util.Scanner;

public class ChangeCaseVowels {
	static Scanner  sc=new Scanner(System.in);
	
	public static String encode(String st) 
	{
		String str="";
		for(int i=0;i<st.length();i++) 
		{
			char c=st.charAt(i);
			
			switch(c) 
			{
			case 'a':
				st+='A';
				break;
			case 'e':
				st+='E';
				break;
			}
			
		}
		return str;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a String");
		String str=encode(str);
		

	}

}
