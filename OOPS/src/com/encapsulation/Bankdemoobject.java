package com.encapsulation;

import java.util.Scanner;

public class Bankdemoobject
{
	static Scanner sc= new Scanner(System.in);
	
	static void deposit(Accountobject a)
	{
		//sc= new Scanner(System.in);
		System.out.println("Enter the amount to be deposited:");
	    float amount= sc.nextFloat();
	    if((a.getBalance()+amount)>=50000)
	     {	    	    
	       	 System.out.println("Balance exceeding 50000 enter pan card details:");
	    	 String pan= sc.next();
	    	 a.setPanCard(pan);
	    	 
	     }
	    
	    a.setBalance(a.getBalance()+amount);
	    
	   System.out.println("Current Balance:"+a.getBalance());   
		
	}
	
	static void withdraw(Accountobject a)
	{
		//sc= new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawl:");
	    float amount= sc.nextFloat();
	    
	    if((a.getBalance()-amount)<0)                 
	     {	    	    
	       	System.out.println("Insufficient Balance ");
	    	 
	     }
	    else
	       a.setBalance(a.getBalance()-amount);
	    System.out.println("Current Balance:"+a.getBalance());   
		
	}

	public static void main(String[] args) {
	
	
    Accountobject a1= new Accountobject(1011,"snehal","BoB"); 
	System.out.println(a1);
	
	int ch,choice;
    do
    {
    	System.out.println("1. Deposit Money");
    	System.out.println("2. Withdraw money");
    	System.out.println("3. Exit");
    	ch= sc.nextInt();
    	
    	switch(ch)
    	{
    	case 1: deposit(a1);
    	        break;
    	case 2: withdraw(a1);
    	        break;
    	case 3: System.exit(0);
    	         break;
    	default: System.out.println("error:");
    	
    	}
    	
    System.out.println(" perform more opration(1-yes,0-no)");
    choice= sc.nextInt();
    	
    }while(choice==1);
	
	
	}

		
	}



