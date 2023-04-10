package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapIsEmpty {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		
		if(map.isEmpty()) {
			System.out.println("HashMap is empty");
		}else
			System.out.println("Hashmap is not empty");

	}

}
