package com.string;

import java.util.Scanner;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		
		String capitalize=capitalFirst(str);
		System.out.println("Capitalized string:"  +capitalize);

	}
	public static String capitalFirst(String str) {
		StringBuilder sb=new StringBuilder();
		boolean capitalizedNext=true;
		
		for(char c:str.toCharArray()) 
		{
			if(Character.isWhitespace(c)) {
				capitalizedNext=true;
			}else if(capitalizedNext){
				sb.append(Character.toUpperCase(c));
				capitalizedNext=false;
			}else {
				sb.append(c);
			}
			
		}
		return sb.toString();
	}

}
