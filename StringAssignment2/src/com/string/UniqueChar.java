package com.string;

import java.util.Scanner;

public class UniqueChar {
	public static void uniqueChar(String s)
	{
		s=s.toLowerCase();
		
		char ch[]= s.toCharArray();
		
		int count;
		int dcount=0;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			if(ch[i]=='\0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			
			 if(count==1) 
			 {
				 dcount++;
				 System.out.println(ch[i]+" :"+count);
			 }
		    
		}			 
			 
		
}

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     
     System.out.println("Enter a string:");
     
     String st= sc.next();
     
     uniqueChar(st);
     

	

}


}



