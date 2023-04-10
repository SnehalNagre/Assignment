package com.stringlogical;

import java.util.Arrays;

public class SortStringAlphabets {
	public static void sortAlphabets(String[] st) 
	{
		for(int i=0;i<st.length;i++)
		{
			String temp;
			for(int j=i+1;j<st.length;j++) 
			{
				if(st[i].compareTo(st[j])>1)
				{
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
		}
	}	
}	
		public static void main(String[] args) {
		String lang[]= {"java","is","programing","language"};
		sortAlphabets(lang);
		
		System.out.println(Arrays.toString(lang));
	}

}
