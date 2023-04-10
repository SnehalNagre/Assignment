package com.arraylist;

import java.util.ArrayList;

public class ArrayListremoveElements {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
	
        list.remove("banana");
        
        list.remove(0);
        
        System.out.println(list);
	}

}
