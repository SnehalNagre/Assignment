package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListValueMap {
    public static void main(String[] args) {
        // Creating a Map with ArrayList as the value
        
    	Map<String, ArrayList<Integer>> map = new HashMap<>();

        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(25);
        list2.add(35);

        
        map.put("List 1", list1);
        map.put("List 2", list2);

      
        ArrayList<Integer> retrievedList1 = map.get("List 1");
        System.out.println("Elements of List 1: " + retrievedList1);

        ArrayList<Integer> retrievedList2 = map.get("List 2");
        System.out.println("Elements of List 2: " + retrievedList2);
    }
}

