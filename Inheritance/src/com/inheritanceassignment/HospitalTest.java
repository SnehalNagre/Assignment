package com.inheritanceassignment;

import java.util.Scanner;

public class HospitalTest {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetails(Hospital h)
	{
		System.out.println("enter name");
		h.setName(sc.next());
		
		System.out.println("enter type");
		h.setName(sc.next());
		
		System.out.println("enter exp");
		h.setName(sc.next());
	
		System.out.println("enter branch");
		h.setName(sc.next());
	
	
	}

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		Hospital h1=new Hospital("neha","ortho","5","zydus");
        System.out.println(h1);*/
        
        Hospital h2=new Hospital();
        System.out.println(h2);
        
        enterDetails(h2);
        System.out.println(h2);
        
	}

}
