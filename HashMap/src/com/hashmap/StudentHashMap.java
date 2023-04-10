package com.hashmap;

import java.util.HashMap;

public class StudentHashMap {

	public static void main(String[] args) {

     HashMap<Integer, Student> smap= new HashMap<>();
     smap.put(1, new Student(1,"Snehal",89f));
     
     Student s1 = new Student(2,"Krutika",78f);
     smap.put(2, s1);
     System.out.println(smap);
     
     smap.put(2, new Student(2,"Shradha",85f));
     
     System.out.println(smap);

	}

}
