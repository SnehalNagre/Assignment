package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MethodArrayList {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Java");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.add(2, "Html");
		System.out.println(al);
		
		
		ArrayList<String> al1= new ArrayList<>();
		al1.add("vb.net");
		al1.add("asp.net");
		
		System.out.println(al1);
		
		//al.addAll(al1);
		
		al.addAll(2,al1);
		
		System.out.println(al);
		
		al.remove("Java"); // remove first occurence from starting
		
		al.removeAll(Collections.singleton("Java"));
		System.out.println(al);
		
	//	al.retainAll(al1); // retains only al1
		
		al.removeAll(al1);
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
		

	}

}
