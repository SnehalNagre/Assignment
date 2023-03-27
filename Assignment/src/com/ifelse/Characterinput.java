package com.ifelse;

import java.util.Scanner;

public class Characterinput {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		char ch;
		System.out.println("Enter a character");
		ch= sc.next().charAt(0);
		
		//System.out.println(ch);
		
		
		if((ch>='A')&&(ch<='Z'))
		{
			System.out.println("Capital letter");
			if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
			
		}
		else if((ch>='a')&&(ch<='z'))
	       	{
			  System.out.println("Small letter");
			  if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
				{
					System.out.println("Vowel");
				}
				else
				{
					System.out.println("Consonant");
				}
	       	}
		   else if((ch>='0')&&(ch<='9'))
		       {
			   System.out.println("Digit");
		       }
		       else
		       {
		    	   System.out.println("Special character");
		       }

		sc.close();
		
	}
	
}



