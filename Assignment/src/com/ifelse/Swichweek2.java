package com.ifelse;

import java.util.Scanner;

public class Swichweek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
		 int weekno= sc.nextInt();
		/*if(weekno==1)
		  System.out.println("Monday");
		else if(weekno==2)
		      System.out.println("Tuesday");
		     else if(weekno==3)
		    	 System.out.println("Wednesday");*/
		
		switch(weekno)
		{
		case 1: System.out.println("Monday");
		        break;
		case 2: System.out.println("Tuesday");
		        break;
		case 3: System.out.println("Wednesday");
		        break;
		case 4: System.out.println("Thursday");
		        break;
		case 5: System.out.println("Friday");
		        break;
		/*default: System.out.println("Wrong input");  
		         break;*/
		case 6: System.out.println("Saturday");
		        break;
		case 7:System.out.println("Sunday");
		       break;
		       
		default: System.out.println("Wrong input");        
		
		}
		
		//System.out.println("Have fun");
		

	}




	}


