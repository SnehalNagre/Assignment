package com.map;

import java.util.HashMap;
import java.util.Map;

public class SearchingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		map.put("E",5);
		
		String key="E";
		if(map.containsKey(key)) 
		{
			int val=map.get(key);
			System.out.println("the value of " +key+ " is " +val);
		}else {
			System.out.println("map does not contain key :"+key);
		}

	}

}
