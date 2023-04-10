package com.containmentarray;

import java.util.Scanner;

public class BookTest {
	static Scanner sc=new Scanner(System.in);
	public static void enterdetails(Book b) 
	{
		Author a=new Author(1,"snehal");
		System.out.println("enter book id");
		b.setBid(sc.nextInt());
		
	}

	public static void main(String[] args) {
		

	}

}
