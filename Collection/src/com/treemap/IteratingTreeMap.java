package com.treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class IteratingTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"c");
		tmap.put(2,"c++");
		tmap.put(3,"Java");
		tmap.put(4,"Python");
		
		Set<Integer> keys=tmap.keySet();
		
		Iterator<Integer> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println(key+" "+tmap.get(key));
		}
		
		

	}

}
