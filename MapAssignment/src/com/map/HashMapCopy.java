package com.map;



	import java.util.HashMap;
	import java.util.Map;

	public class HashMapCopy {
	    public static void main(String[] args) {
	        // Creating the specified HashMap
	        Map<String, Integer> hmap = new HashMap<>();
	        hmap.put("A", 1);
	        hmap.put("B", 2);
	        hmap.put("C", 3);
	        System.out.println("Specified HashMap: " + hmap);

	        // Creating the another Map
	        Map<String, Integer> map = new HashMap<>();

	        // Copying all mappings 
	        map.putAll(hmap);

	        System.out.println("Another HashMap: " + map);
	    }
	


	}


