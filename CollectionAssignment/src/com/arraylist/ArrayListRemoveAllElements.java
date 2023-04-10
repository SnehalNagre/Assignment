package com.arraylist;

import java.util.ArrayList;

public class ArrayListRemoveAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
	
        list.clear();
        
        System.out.println(list);

	}

}
