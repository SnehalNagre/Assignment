package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

    // one null key
   // duplicate keys not allowed
		
   // duplicate and multiple null values
		
	HashMap<String,Integer> map= new HashMap<>();
	map.put("Snehal", 89);
	map.put("Siya", 90);
	map.put("Riya", 78);
	map.put("Neha", 92);
	System.out.println(map.put(null, 0));
	System.out.println(map.put(null, 1));
	
	System.out.println(map);
	
	System.out.println("Size:"+map.size());
	System.out.println("Value:"+map.get("Snehal"));
	
	//checks key
	
	System.out.println(map.containsKey("Siya"));
	
	System.out.println(map.containsValue(90));
	
	map.putIfAbsent("Snehal", 93);
	
	System.out.println(map);
	
	map.putIfAbsent("Rupal", 78);
	System.out.println(map);
	
	
	
	

	}

}
