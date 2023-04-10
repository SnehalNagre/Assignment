package com.linkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArray {
	public static void arraySort(ArrayList<Integer> list) 
	{
		int temp;
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.size();j++) 
			{
				if(list.get(i)>list.get(j)) 
				{
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(56);
		al.add(44);
		al.add(67);
		al.add(35);
		al.add(77);
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println(al);
		

	}

}
