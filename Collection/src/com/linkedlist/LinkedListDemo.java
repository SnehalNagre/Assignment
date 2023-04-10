package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Guava");
		list.add("Banana");
		
		System.out.println(list);
		list.addFirst("Kiwi");
		list.addLast("Orange");
		System.out.println(list);
		
		list.offer("Berry");
		list.offerLast("pineApple");
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		System.out.println(list.remove(3));
		System.out.println(list.poll());

	}

}
