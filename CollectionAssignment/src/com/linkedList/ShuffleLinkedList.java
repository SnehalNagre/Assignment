package com.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {

	public static void main(String[] args) {
     LinkedList<Integer> llist=new LinkedList<>();
     llist.add(1);
     llist.add(2);
     llist.add(3);
     llist.add(4);
     llist.add(5);
     
     System.out.println("LinkedList before shuffle:"+llist);
     Collections.shuffle(llist);
     System.out.println("LinkedList after shuffle:"+llist);
	}

}
