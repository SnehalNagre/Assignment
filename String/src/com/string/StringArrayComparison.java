package com.string;

public class StringArrayComparison {
	
	public static void uniqueString(String str1[],String str2[] )
	{
		boolean found;
		for(String s:str2)
		{
			found=false;
			
			for(String si:str1)
			{
				if(s.equals(si))
				{
					found=true;
					break;
				}
				   
			}
			
			if(!found)
			{
				System.out.println(s);
			}
		}
		
		
		
	}

	public static void main(String[] args) {

     String s1[]= {"Snehal","Joy","Surya","Moni","Vinny"};
     String s2[]= {"Gautam","Shlok","Joy","Sara","Vinny"};
     
     uniqueString(s1, s2);
     

	}

}

