package com.arraylistlogical;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntValues {
	
	public static void sortArrayList(ArrayList<Integer> list)
	{
		int temp;
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					temp= list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {

      ArrayList<Integer> al= new ArrayList<>();
      al.add(34);
      al.add(56);
      al.add(13);
      al.add(90);
      al.add(10);
      
      System.out.println(al);
      
      //Collections.sort(al);
      Collections.sort(al,Collections.reverseOrder());
      
      System.out.println(al);

	}

}
