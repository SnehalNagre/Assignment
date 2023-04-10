package com.map;

import java.util.HashMap;
import java.util.Map;

class CustomKeys {
    int id;
    String name;

    public CustomKeys(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
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

class CustomValue {
    private String address;
    private int age;

    public CustomValue(String address, int age) {
        this.address = address;
        this.age = age;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class CustomKeyCustomValueMap {
    public static void main(String[] args) {
        // Creating a Map using a custom class as the key and value
        Map<CustomKey, CustomValue> map = new HashMap<>();
        map.put(new CustomKey(1, "John"), new CustomValue("New York", 30));
        map.put(new CustomKey(2, "Lisa"), new CustomValue("Los Angeles", 25));
        map.put(new CustomKey(3, "Bob"), new CustomValue("Chicago", 35));

        // Retrieving values from the Map using the custom keys
        CustomKey key1 = new CustomKey(1, "John");
        CustomValue value1 = map.get(key1);
        System.out.println("The value for key " + key1.id + "-" + key1.name + " is " +
                value1.getAddress() + ", " + value1.getAge() + " years old.");

        CustomKey key2 = new CustomKey(2, "Lisa");
        CustomValue value2 = map.get(key2);
        System.out.println("The value for key " + key2.id + "-" + key2.name + " is " +
                value2.getAddress() + ", " + value2.getAge() + " years old.");

        CustomKey key3 = new CustomKey(3, "Bob");
        CustomValue value3 = map.get(key3);
        System.out.println("The value for key " + key3.id + "-" + key3.name + " is " +
                value3.getAddress() + ", " + value3.getAge() + " years old.");
    }
}

