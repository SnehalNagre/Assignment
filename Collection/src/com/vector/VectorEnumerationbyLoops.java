package com.vector;

import java.util.Vector;

public class VectorEnumerationbyLoops {

	public static void main(String[] args) {
		Vector<String> vec =new Vector<>();
		
		vec.add("Pink");
		vec.add("Red");
		vec.add("Blue");
		vec.add("purple");
		vec.add("yellow");
		
		for(int i=0;i<vec.size();i++)
		{
			System.out.println(vec.get(i));
		}

	}

}
