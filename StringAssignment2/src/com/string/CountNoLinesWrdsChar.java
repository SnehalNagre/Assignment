package com.string;

import java.util.Scanner;

public class CountNoLinesWrdsChar {
       public static void main(String[] args) {
		
    	   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the String:");
		   String str=sc.nextLine();
		
		   int numLines=countLines(str);
		   int numWords=countWords(str);
		   int numChar=countChars(str);
		   
		   System.out.println("number of lines:" +numLines);
		   System.out.println("number of words:" +numWords);
		   System.out.println("number of characters:" +numChar);
		   
       }
		   
		   
	public static int countLines(String str) 
	{
		return str.split("\r\n|\r|\n").length;
	}
	public static int countWords(String str) 
	{
		return str.split("\\s+").length;
	}
	public static int countChars(String str) 
	{
		return str.length();
	}
		
}


