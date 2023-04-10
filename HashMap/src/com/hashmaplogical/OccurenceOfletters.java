package com.hashmaplogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//ArrayList to HashMap
public class OccurenceOfletters{
	public static void createMap(ArrayList<String> al) 
	{
		HashMap<String,Integer> map=new HashMap<>();
		for(String s:al)
		{
			if(map.containsKey(s))
			map.put(s,map.get(s)+1);
			
			else
			   map.put(s,1);
		}
			for(Map.Entry<String,Integer> em:map.entrySet()) 
			{
				System.out.println(em.getKey()+" : "+em.getValue());
			}
			
		
		
	}

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("c");
		list.add("A");
		list.add("B");
		list.add("c");
		list.add("A");
		
		System.out.println(list);

         createMap(list);


	}

}
