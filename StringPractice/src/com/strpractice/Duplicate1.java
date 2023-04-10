package com.strpractice;

public class Duplicate1 {
	public static void duplicate(String st) {
		
		st=st.toLowerCase();
		String[] splitstr=st.split("\\s");
		int count;
		int dcount=1;
		for(int i=0;i<splitstr.length;i++)
		{
			count=1;
			if(splitstr[i].equals("visited")) 
			continue;
			for(int j=i+1;j<splitstr.length;j++) 
			{
				if(splitstr[i].equals(splitstr[j])) 
				{
					count++;
					splitstr[j]="visited";
				}
			}
			if(count>1) 
			{
				dcount++;
				System.out.println("splitstr:" +count);
			}
		}
		System.out.println("no of duplicate words:" +dcount);
	}

	public static void main(String[] args) {
		String str= "hello hello to java java to";
        duplicate(str);
	}

}
