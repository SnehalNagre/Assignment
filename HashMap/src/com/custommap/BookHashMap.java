package com.custommap;

import java.util.HashMap;
import java.util.Map;

public class BookHashMap {

	public static void main(String[] args) {
		
		HashMap<Book,Author> bmap= new HashMap<>();
		Book b1=new Book(101,"Ramayan",890f);
		
		Book b2= new Book(104,"Secret",670f);
		
		bmap.put(b1,new Author(1,"Valmiki"));
		bmap.put(new Book(102,"HarryPotter",1090f),new Author(2,"J Rowling"));
		System.out.println(bmap.put(new Book(102,"HarryPotter",1090f),new Author(2,"J.k Rowling")));
		bmap.put(new Book(103,"HarryPotter2",1100f),new Author(2,"J.K Rowling"));
		
		bmap.put(null, new Author(0, null));
		for(Map.Entry<Book, Author> en: bmap.entrySet())
		{
			System.out.println(en.getKey()+" ->"+en.getValue());
		}
		
       System.out.println(bmap.get(null));
       
       System.out.println(bmap.get(b1));
		
       System.out.println(bmap.get(b2));			

	}

}
