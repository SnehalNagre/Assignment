package com.map;

	import java.util.HashMap;
	import java.util.Map;

	public class HashMapRemoveByKey {
	    public static void main(String[] args) {
	        // Creating a HashMap
	        Map<String, Integer> map = new HashMap<>();
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);

	        // Removing an element using a key
	        String key = "B";
	        if (map.containsKey(key)) {
	            int value = map.remove(key);
	            System.out.println("The value " + value + " has been removed for key " + key);
	        } else {
	            System.out.println("The HashMap does not contain the key " + key);
	        }

	        // Displaying the updated HashMap
	        System.out.println("The updated HashMap is: " + map);
	    }
	}



