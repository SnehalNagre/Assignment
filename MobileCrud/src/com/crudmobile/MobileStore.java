package com.crudmobile;
import java.util.Scanner;

public class MobileStore {
	static int mCount=0;
	static Scanner sc= new Scanner(System.in);
	public static void addMobile(Mobile m)
	{
		System.out.println("Enter Mob Id:");
		m.setId(sc.nextInt());
		
		System.out.println("Enter Mob name:");
		m.setName(sc.next());
		
		System.out.println("Enter Mob brand:");
		m.setBrand(sc.next());
		
		
		System.out.println("Enter mob Price:");
		m.setPrice(sc.nextDouble());
	}
	public static void deleteMobile(Mobile[] mob, int id)
	{
		boolean flag= false;
		
		for(int i=0;i<mCount;i++)
		{
			if(mob[i].getId()==id)
			{
				flag =true;
				
				System.out.println(mob[i].getName());
				
				for(int j=i;j<mCount-1;j++)
				{
					mob[j]=mob[j+1];
					
				}
				mob[mCount-1]=null;
				mCount=mCount-1;						
				System.out.println("Mobile deleted succesfully");
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Mob not found");
		
	}
	public static void updateMobile(Mobile[] mob, int rid) 
	{
       boolean flag= false;
		
		for(int i=0;i<mCount;i++)
		{
			if(mob[i].getId()==rid)
			{
				flag =true;
				System.out.println("Mobile details are:");
				//System.out.println(mob[i]);
				
				System.out.println("Enter mob name:");
				mob[i].setName(sc.next());
				
				System.out.println("Enter mob brand:");
				mob[i].setBrand(sc.next());
				
				System.out.println("Enter mob price:");
				mob[i].setPrice(sc.nextDouble());
				
				System.out.println("Mobile updated succesfully");
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Mob not found");
		
	}
	public static void viewMobileByBrand(Mobile[] mob, String mbrand) 
	{
       boolean flag= false;
		
		for(int i=0;i<mCount;i++)
		{
			if(mob[i].getBrand().equals(mbrand))
			{
				flag =true;
				System.out.println("Mob details are:");
				System.out.println("Mob Id:"+mob[i].getId()
						+"\n Name:"+mob[i].getName()
						+"\n Brand:"+mob[i].getBrand()
						+"\n Price: "+mob[i].getPrice());
								
				break;
								
			}
			
		}
		if(!flag)
			System.out.println("Mob not found");
	}
	
	public static void viewAllMobiles(Mobile[] mob)
	{

	System.out.println("================================================");
	System.out.println("--------------Mobile List-----------------");
	System.out.println("=================================================");
      for(int i=0;i<mCount;i++)
      {
    	  System.out.println("Mob Id:"+mob[i].getId()
					+"\n Name:"+mob[i].getName()
					+"\n Brand:"+mob[i].getBrand()
					+"\n Price: "+mob[i].getPrice());
							
      }
			
		
	}

     public static void main(String[] args) {
		      Mobile m1[]= new Mobile[20];
	
 		        int choice;
 		        String ch;
         do
         {
          System.out.println("---------------Mobile Store-----------------------");
   	      System.out.println("1.Add a Mobile");
   	      System.out.println("2.Delete a Mobile");
   	      System.out.println("3.Update a Mobile");
   	      System.out.println("4.View Mobile by brand");
   	      System.out.println("5.View all Mobiles");
   	      System.out.println("0:EXIT");
   	 
   	      choice= sc.nextInt();
   	
   	       switch(choice)
   	       {
   	       case 1:
   	    	   if(mCount<m1.length) 
   	    	   {
   	    	   m1[mCount]= new Mobile();
   		       addMobile(m1[mCount]);
   		       mCount++;
   	    	   }
   	              else
   	                {
   	    	         System.out.println("No more mobiles");
   	                }
     	         break;
   	             
          case 2: 
        	  System.out.println("Enter id to be deleted:");
   	          int id= sc.nextInt();
   	          deleteMobile(m1, id);
   	          break;
   	      case 3:
   	    	 System.out.println("Enter id to be updated:");
   	         id= sc.nextInt();
   	         updateMobile(m1, id);
     	         break; 
   	      case 4:
   	    	    System.out.println("Enter the mob brand :");
                String mbrand= sc.next();
                viewMobileByBrand(m1, mbrand);
	              break;        
   	      case 5:viewAllMobiles(m1);
   	        break; 
   	      }  
      
     
     System.out.println("Do you want to perform more operation(yes/no)");	
     ch=sc.next();

       
	}
    while(ch.equalsIgnoreCase("yes"));
  }
} 

	




	

