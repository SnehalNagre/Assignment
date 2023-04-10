package com.arraylistlogical;

import java.util.ArrayList;


	public class RemoveDuplicate {
		
		public static void removeD(ArrayList<String> list1)
		{
			ArrayList<String> list2= new ArrayList<>();
			
			for(String s:list1)
			{
				if(!list2.contains(s))
				{
					list2.add(s);
				}
			}
			
			System.out.println(list2);
		}

		public static void main(String[] args) {

			ArrayList<String> al1= new ArrayList<>();
			al1.add("Java");
			al1.add("Python");
			al1.add("Angular");
			al1.add("Spring");
			al1.add("Html");
			al1.add("Java");
			al1.add("Spring");
			
			removeD(al1);
			

		}

	}
