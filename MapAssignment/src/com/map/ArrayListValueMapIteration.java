package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListValueMapIteration {
    public static void main(String[] args) {
        // Creating a Map with ArrayList as the value
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        // Adding elements to the ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(25);
        list2.add(35);

        // Putting the ArrayLists in the Map
        map.put("List 1", list1);
        map.put("List 2", list2);

        // Iterating over the elements in the ArrayLists
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.println("Elements of " + key + ":");
            for (Integer element : value) {
                System.out.println(element);
            }
        }
    }
}

