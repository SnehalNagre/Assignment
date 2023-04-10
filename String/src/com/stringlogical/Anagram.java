package com.stringlogical;

import java.util.Scanner;

public class Anagram {
	
	public static void checkAnagram(String str1,String str2) {
		boolean status =false;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first String:");
		String s1=sc.next();
		
		System.out.println("enter second String:");
		String s2=sc.next();
		
		checkAnagram(s1,s2);
		

	}

}
