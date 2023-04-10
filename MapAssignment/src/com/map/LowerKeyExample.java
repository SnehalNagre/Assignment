package com.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class LowerKeyExample {
    public static void main(String[] args) {
        // Creating a TreeMap and adding some key-value pairs
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Value 1");
        treeMap.put(20, "Value 2");
        treeMap.put(30, "Value 3");
        treeMap.put(40, "Value 4");
        treeMap.put(50, "Value 5");

        // Getting the greatest key strictly less than the given key
        Integer key = treeMap.lowerKey(35);

        // Checking if the returned key is null or not
        if (key == null) {
            System.out.println("There is no key strictly less than 35");
        } else {
            System.out.println("The greatest key strictly less than 35 is: " + key);
        }
    }
}

