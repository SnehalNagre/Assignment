package com.containment;

import java.util.Scanner;

public class LibraryInput2 {
    static Scanner sc = new Scanner(System.in);
	
	public  void enterBookDetails(Book b)
	{		 
		 Author a= new Author();
	     System.out.println("Enter book id:");
	     b.setBid(sc.nextInt());
	     
	     System.out.println("Enter book name:");
	     b.setBname(sc.next());
	     
	     System.out.println("Enter book price:");
	     b.setPrice(sc.nextFloat());
	       
	     authorDetails(a);
	     b.setAuthor(a);
	       
	 
	}
	
	public void authorDetails(Author a)
	{
		 System.out.println("Enter author id:");
	     a.setAid(sc.nextInt());
	     
	     System.out.println("Enter author name:");
	     a.setAname(sc.next());
	     
	     System.out.println("Enter author age:");
	     a.setAge(sc.nextInt());
	}
	

	public static void main(String[] args) {
		LibraryInput2 lib = new LibraryInput2();
		
         Book b1= new Book();
     
         lib.enterBookDetails(b1);
         System.out.println(b1);
         
         Book b2= new Book();
         lib.enterBookDetails(b2);
         System.out.println(b2);
         
         
         Author a1= new Author();
         lib.authorDetails(a1);
    

	}

}
