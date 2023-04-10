package com.arraylistlogical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArrayList {
	
	public static void reverseList(ArrayList<String>list)
	{
		Iterator<String> itr= list.iterator();
		ListIterator<String> litr= list.listIterator(list.size());
				
		String temp;		
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--)
		{
			temp= list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			
		}
		
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> al1= new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Angular");
		al1.add("Spring");
		al1.add("Html");
		
		System.out.println(al1);
		
		//Collections.reverse(al1);
		//System.out.println(al1);
		
		reverseList(al1);
		
	}
	

}
