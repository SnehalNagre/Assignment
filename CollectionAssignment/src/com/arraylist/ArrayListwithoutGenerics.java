package com.arraylist;

import java.util.ArrayList;

public class ArrayListwithoutGenerics {

	public static void main(String[] args) {
		ArrayList intlist = new ArrayList();
		intlist.add(7);
		intlist.add(8);
		intlist.add(9);
		
		ArrayList stringlist = new ArrayList();
		stringlist.add("apple");
		stringlist.add("Banana");
		stringlist.add("kiwi");
		
		for(int i=0;i<intlist.size();i++)
		{
			int value=(int) intlist.get(i);
			System.out.println(value);
		}
		
		for(int j=0;j<stringlist.size();j++)
		{
			String value=(String) stringlist.get(j);
			System.out.println(value);
		}
	}

}
