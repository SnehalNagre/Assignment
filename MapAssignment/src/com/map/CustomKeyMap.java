package com.map;

import java.util.HashMap;
import java.util.Map;

	class CustomKey {
	    int id;
	    String name;

	    public CustomKey(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Override hashCode() and equals() methods
	    @Override
	    public int hashCode() {
	        return id * 31 + name.hashCode();
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (!(obj instanceof CustomKey)) {
	            return false;
	        }
	        CustomKey other = (CustomKey) obj;
	        return this.id == other.id && this.name.equals(other.name);
	    }
	}

	public class CustomKeyMap {
	    public static void main(String[] args) {
	        // Creating a Map using a custom class as the key
	        Map<CustomKey, String> map = new HashMap<>();
	        map.put(new CustomKey(1, "John"), "New York");
	        map.put(new CustomKey(2, "Lisa"), "Los Angeles");
	        map.put(new CustomKey(3, "Bob"), "Chicago");

	        // Retrieving values from the Map using the custom keys
	        CustomKey key1 = new CustomKey(1, "John");
	        String value1 = map.get(key1);
	        System.out.println("The value for key " + key1.id + "-" + key1.name + " is " + value1);

	        CustomKey key2 = new CustomKey(2, "Lisa");
	        String value2 = map.get(key2);
	        System.out.println("The value for key " + key2.id + "-" + key2.name + " is " + value2);

	        CustomKey key3 = new CustomKey(3, "Bob");
	        String value3 = map.get(key3);
	        System.out.println("The value for key " + key3.id + "-" + key3.name + " is " + value3);
	    }
	}



