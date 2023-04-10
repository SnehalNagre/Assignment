package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap2 {

	public static void main(String[] args) {

     HashMap<Student, String> smap= new HashMap<>();
     smap.put(new Student(1,"Snehal",89f),"Java");
       
     smap.put(new Student(2,"Krutika",78f),"Python");

     for(Map.Entry<Student, String> en: smap.entrySet())
     {
    	 System.out.println(en.getKey());
    	 System.out.println(en.getValue());
    	 
    	 System.out.println("===============================");
     }
     
     smap.put(new Student(2,"Krutika",78f),"Java");
     System.out.println("////////////////////////////////////////////");
     
     for(Map.Entry<Student, String> en: smap.entrySet())
     {
    	 System.out.println(en.getKey());
    	 System.out.println(en.getValue());
    	 
    	 System.out.println("===============================");
     }

	}

}
