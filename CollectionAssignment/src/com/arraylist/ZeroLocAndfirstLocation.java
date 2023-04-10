package com.arraylist;

import java.util.ArrayList;

public class ZeroLocAndfirstLocation {

	public static void main(String[] args) {
	  ArrayList list=new ArrayList<>();
	  list.add(0, 5);
	  list.add(1,"apple");
	  list.add(2,10);
	  list.add(3,"Kiwi");
	  list.add(4,20);
	  list.add(5,"Orange");
	  
	  System.out.println("Elements in the ArrayList:");
	  for(int i=0;i<list.size();i++) 
	  {
		  Object element=list.get(i);
		  if(element instanceof Integer) 
		  {
			  System.out.println("Integer at Index " +i+ ":" +element);
		  }else if(element instanceof String) {
			  System.out.println("String at Index " +i+ ":" +element);  
		  }
		  
	  }
	  System.out.println("\ncontents of ArrayList:");
	   for(Object element:list) {
		   System.out.println(element);
	   }
	  
	  

	}

}
