package com.map;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        // Creating a Map with another Map as the value
        Map<String, Map<String, Integer>> nestedMap = new HashMap<>();

        // Creating a nested map
        Map<String, Integer> innerMap = new HashMap<>();
        innerMap.put("A", 1);
        innerMap.put("B", 2);
        innerMap.put("C", 3);

        // Putting the nested map in the outer map
        nestedMap.put("Nested Map", innerMap);

        // Retrieving values from the nested map
        Map<String, Integer> retrievedInnerMap = nestedMap.get("Nested Map");
        int value = retrievedInnerMap.get("B");
        System.out.println("Value of B in the nested map: " + value);
    }
}

