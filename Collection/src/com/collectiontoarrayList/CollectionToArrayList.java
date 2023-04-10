package com.collectiontoarrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArrayList {

	public static void main(String[] args) {
		String colours[]= {"Red","Blue","Black","Green"};
		
		//1st way
		List<String> s1=Arrays.asList(colours);
		System.out.println(s1);
		
		//2nd way
		ArrayList<String> al=new ArrayList<>();
		Collections.addAll(al,colours);
		
		System.out.println(al);
		
		System.out.println("....ArrayList to Array....");
		
		Object[] col=al.toArray();
		System.out.println(Arrays.toString(col));
		
		for(int i=0;i<col.length;i++) 
		{
			col[i]=((String) col[i]).concat("colours");
			
		}
		System.out.println(Arrays.toString(col));
		
		//typesafe
		
		String cols[]=new String[al.size()];
		al.toArray(cols);
		
		for(int i=0;i<cols.length;i++) 
		{
			cols[i]=cols[i].concat("Name");
		}
		System.out.println(Arrays.toString(cols));
		

	}

}
