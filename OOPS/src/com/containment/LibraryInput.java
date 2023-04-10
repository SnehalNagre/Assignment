package com.containment;

import java.util.Scanner;

public class LibraryInput {
	
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     
     
     Book b= new Book();
     Author a= new Author();
     
     System.out.println("Enter book id:");
     b.setBid(sc.nextInt());
     
     System.out.println("Enter book name:");
     b.setBname(sc.next());
     
     System.out.println("Enter book price:");
     b.setPrice(sc.nextFloat());
     
     /*------------------------------------*/
     
     System.out.println("Enter author id:");
     a.setAid(sc.nextInt());
     
     System.out.println("Enter author name:");
     a.setAname(sc.next());
     
     System.out.println("Enter author age:");
     a.setAge(sc.nextInt());
     
     b.setAuthor(a);
     
     
     System.out.println("---------------------------");
     System.out.println(b);
     
     /*------------------------------------------*/
     
    

	}

}

