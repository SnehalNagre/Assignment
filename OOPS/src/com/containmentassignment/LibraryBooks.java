package com.containmentassignment;

import java.util.Scanner;

public class LibraryBooks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Author a=new Author();
		Book b=new Book();
		
		System.out.println("enter bookid");
		b.setId(sc.nextInt());
		
		System.out.println("enter bookname");
		b.setName(sc.next());
		
//------------------------------------------------------//
		System.out.println("enter author id");
		a.setId(sc.nextInt());
		
		System.out.println("enter author name");
		a.setName(sc.next());
		
		b.setAuthor(a);
        System.out.println(b);
	}

}
