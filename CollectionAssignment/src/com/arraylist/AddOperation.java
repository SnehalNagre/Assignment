package com.arraylist;

import java.util.ArrayList;

public class AddOperation {

	public static void main(String[] args) {
	 ArrayList<String> list=new ArrayList<>();
	 
	 list.add("apple");
	 list.add("Banana");
	 list.add("Kiwi");
	 list.add("Orange");
	 
    
	 System.out.println(list);
	 
	 list.add(1,"Cherry");
	 
	 System.out.println(list);
	 
	 ArrayList<String> al=new ArrayList<>();
	 al.add("Grape");
	 al.add("Guava");
	 
	 list.addAll(al);
	 System.out.println(list);
	}

}
