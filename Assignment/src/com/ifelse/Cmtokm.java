package com.ifelse;

import java.util.Scanner;

public class Cmtokm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double cm,mtr,km;
		System.out.println("enter length in centimeter:");
		cm=sc.nextDouble();
		//convert cm to mtr and km
		mtr=cm/100.0;
		km=cm/100000;
		System.out.println("length in meter" +mtr+ "mtr");
		System.out.println("lenth in kilometer" +km+ "km");
		

	}

}
