package com.arraylistlogical;

import java.util.ArrayList;

public class SearchArrayList {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Java");
		al.add("Java");
		
		System.out.println(al);

		System.out.println(al.contains("Java"));
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).equals("Java"))
				al.set(i,"Core Java");
		}
		
		System.out.println(al);

	}

}
