package com.strpractice;

public class UniqueString {
	
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

     String s1[]= {"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"};
     String s2[]= {"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"};
     
     uniqueString(s1, s2);
     

	}

}

