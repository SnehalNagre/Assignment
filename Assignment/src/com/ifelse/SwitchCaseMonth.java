package com.ifelse;

import java.util.Scanner;

public class SwitchCaseMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month:");
		int month=sc.nextInt();
		
		switch(month) {
		     case 1 :
		     case 3 :
		     case 5 :
		     case 7 :
		     case 8 :
		     case 10:
		     case 12:System.out.println("31 days");
		     break;
		
		         case 4:
		         case 6:
		         case 9:
		         case 11:System.out.println("30days");
		    	 break;
		    	 
		         case 2: System.out.println("enter year:");
		    	 int year=sc.nextInt();
		    	 
		    	 if(year/400==0) {
		    		 System.out.println(" 29 days");
		    	 }else
		    		 System.out.println("28days");
		    	 break;
		         
		    default :System.out.println("error");
		 }   
    }

}
		

	


