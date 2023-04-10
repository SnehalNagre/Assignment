package com.map;

import java.util.HashMap;
import java.util.Map;

public class SpecifiedKey {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("A",1);
		map.put("B",1);
		map.put("C",1);
		map.put("D",1);
		
		String key="E";
		if(map.containsKey(key)) {
			System.out.println("hashmap contains key:"+key);
		}else
			System.out.println("hashmap does not contains key:"+key);

	}

}
