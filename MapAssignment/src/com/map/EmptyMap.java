package com.map;

import java.util.HashMap;
import java.util.Map;

public class EmptyMap {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Emptying the Map
        for (String key : map.keySet()) {
            map.remove(key);
        }

        // Checking if the Map is empty
        if (map.isEmpty()) {
            System.out.println("The Map is empty.");
        } else {
            System.out.println("The Map is not empty.");
        }
    }
}



