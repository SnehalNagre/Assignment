package com.ifelse;

import java.util.Scanner;

public class Maximumbtthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the char:");
         char ch=sc.next().charAt(0);
         
         if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u' ) {
        	 System.out.println("char is vowel");
         }else
        	 System.out.println("char is consonant");
	}

}
