package com.arraylistlogical;

import java.util.ArrayList;

public class FrequencyArrayList {
	public static void calFrequency(ArrayList<String> al)
	{
		int count;
		for(int i=0;i<al.size();i++)
		{
			count=1;
			if(al.get(i).equals("visited"))
			continue;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.set(j,"visited");
					count++;
				}
			}
			System.out.println(al.get(i)+" : "+count);
			
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("c");
		list.add("B");
		list.add("c");
		list.add("A");
		
		System.out.println("frequency of list is:");
        calFrequency(list);
	}

}
