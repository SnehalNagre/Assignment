package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackElements {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		stk.add("apple");
		stk.add("orange");
		stk.add("banana");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		
		System.out.println(stk);
		
		System.out.println(stk.pop());
		
		System.out.println(stk.search("orange"));
		System.out.println(stk.search("Kiwi"));
		
		Enumeration<String> enm=stk.elements();
		while(enm.hasMoreElements()) 
		{
			System.out.println(enm);
		}
		
		
		
	}

}
