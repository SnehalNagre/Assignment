package com.vector;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> colours=new Vector<>();
		
		System.out.println("Size:" +colours.capacity());
		System.out.println("capacity:" +colours.capacity());
		
		colours.add("Blue");
		colours.add("Red");
		colours.add("Pink");
		colours.add("Green");
		colours.add("Yellow");
		colours.add("Black");
		colours.add("Brown");
		colours.add("Purple");
		colours.add("Maroon");
		colours.add("Black");
		
		System.out.println("Size:" +colours.capacity());
		System.out.println("capacity:" +colours.capacity());
		
		colours.add("Pink");
		colours.ensureCapacity(20);//minimum capacity to maintain
		
		System.out.println("Size:" +colours.capacity());
		System.out.println("capacity:" +colours.capacity());
		
		System.out.println("======================");
		
		System.out.println(colours.get(4));
		System.out.println(colours.elementAt(4));
		
		System.out.println(colours.set(3,"voilet"));
		System.out.println(colours);
		
		System.out.println("===========================");
		
		ListIterator<String> listr=colours.listIterator(colours.size());
		while(listr.hasPrevious())
		{
			System.out.println(listr.previous());
		}
		

	}

}
