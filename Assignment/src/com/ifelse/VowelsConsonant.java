package com.ifelse;

import java.util.Scanner;

public class VowelsConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		System.out.println("enter character:");
		
		if((ch>='A')&& (ch<='z')) {
			System.out.println("capital");
			
			if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='o')||(ch=='U')) {
			System.out.println("char is vowel:" +ch);
		
			}else {
				System.out.println("char is consonant:" +ch);
		}
		}		
		
		else if((ch>='a')&& (ch<='z')) {
			System.out.println("small");
			
			
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				System.out.println("char is vowel:" +ch);
			}else {
				System.out.println("char is consonant:" +ch);
		}
		}		
	 sc.close();
	}

}
