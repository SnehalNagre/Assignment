package com.arraylist;

import java.util.ArrayList;

public class UsingForEachLoop {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		  list.add("Kiwi");
		  list.add("Banana");
		  list.add("Apple");
		  
		  for(String data:list)
		  {
			  System.out.println(data);
		  }

	}

}
