package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String,Double> map= new HashMap<>();
		map.put("Siya", 89.5);
		map.put("Soham", 90.0);
		map.put("Vihan", 78.6);
		map.put("Snehal", 92.0);
		map.put("Jiya", 78.9);
		
		System.out.println(map);
		
		System.out.println("========================================");
		///////all keys
		
		Set<String> keyset= map.keySet();
		
		for(String s:keyset)
		{
			System.out.println(s);
		}
		
		System.out.println("========================================");
		///////all values
		
		Collection<Double> marks=map.values();
		
		for(Double m:marks)
		{
			System.out.println(m);
		}
		
		System.out.println("========================================");
		///////key value pair
		
		Set<String> keys= map.keySet();
		
		Iterator<String> itr= keys.iterator();
		
		while(itr.hasNext())
		{
			String k= itr.next();
			System.out.println(k+"  :"+map.get(k));
		}
		
		System.out.println("========================================");
		///////key value pair
		
		for(Map.Entry<String,Double> en: map.entrySet())
		{
			System.out.println(en.getKey()+" :"+en.getValue());
		}
		
		System.out.println("========================================");
		///////key value pair
		
		Set<Entry<String,Double>> entries= map.entrySet();
		
		for(Entry<String,Double> e:entries)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
	}

}
