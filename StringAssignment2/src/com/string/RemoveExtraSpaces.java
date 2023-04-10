package com.string;

import java.util.Scanner;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:");
		String str=sc.nextLine();
		
		String strwithoutextraspaces=str.replaceAll("\\s+","").trim();
		
		System.out.println("Stringwithoutspaces :" +strwithoutextraspaces);

	}

}
