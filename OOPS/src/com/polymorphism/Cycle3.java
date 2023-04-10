package com.polymorphism;

public class Cycle3 {
	
	public Cycle3() {
		System.out.println("default constructor is called");
	}
	public Cycle3(String name) {
		this();
		System.out.println("parameterised constructor:" +name);
	}

	public static void main(String[] args) {
		Cycle3 c=new Cycle3("abc");

	}

}
