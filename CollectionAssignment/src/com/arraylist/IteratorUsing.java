package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUsing {

	public static void main(String[] args) {
	  ArrayList<String> al=new ArrayList<>();
	  al.add("Kiwi");
	  al.add("Banana");
	  al.add("Apple");
	  
	  Iterator<String> iterator=al.iterator();
	  while(iterator.hasNext()) 
	  {
		  String str=iterator.next();
		  System.out.println(str);
	  }
	  
	  

	}

}
