package com.arraylist;

import java.util.ArrayList;

public class UsingForLoop {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		  al.add("Kiwi");
		  al.add("Banana");
		  al.add("Apple");
		  
		  for(int i=0;i<al.size();i++)
		  {
			  String data=al.get(i);
			  System.out.println(data);
		  }

	}

}
