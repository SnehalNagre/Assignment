package com.ifelse;

import java.util.Scanner;

public class Simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		
		System.out.println("enter operators (+,-,/,*)");
		char op=sc.next().charAt(0);
		
		
		double o = 0;
		switch(op)
		{
		case '+':
			o=num1-num2;
			
			break;
		case '-':
			o=num1-num2;
		case '*':
			o=num1*num2;
		case '/':
			o=num1/num2;
			break;
		default :System.out.println("input is wrong");
		}
          System.out.println(num1+""+op+""+num2+"="+o);
	}

}
