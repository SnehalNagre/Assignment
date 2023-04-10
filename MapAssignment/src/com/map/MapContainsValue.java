package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapContainsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		map.put("E",5);
		
		int value=4;
		if(map.containsKey(value)) 
		{
			System.out.println("the value contains in map:" +value);
		}else {
			System.out.println("map does not contain value :"+value);
		}



	}

}
