package com.ifelse;

public class GreaterThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int greater;
		int a = 5;
		int b=6;
		int c = 7;
		greater=(a>b)?((a>c)? a:c):((b>c)? b:c );
		System.out.println("greater no is : " +greater);

	}

}
