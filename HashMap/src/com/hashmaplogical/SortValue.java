package com.hashmaplogical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortValue {
	public static void keySort(HashMap<String,Double> map) {
	ArrayList<Double> list=new ArrayList<>(map.values());
	Collections.sort(list);
	LinkedHashMap<String,Double> lmap=new LinkedHashMap<>();
	
	for(Double m:list) {
		
		for(Map.Entry<String,Double> en:lmap.entrySet())
	     {
			if(en.getValue()==m)
			{
				String k=en.getKey();
				if(!lmap.containsKey(k)) 
				{
					lmap.put(k,m);
				}
			}
	     }
		
	}

	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		}

}
