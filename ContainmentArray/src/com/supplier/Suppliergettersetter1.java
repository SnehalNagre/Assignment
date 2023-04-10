package com.supplier;

import java.util.Scanner;

public class Suppliergettersetter1 {
	static Scanner sc=new Scanner(System.in);
	
	public static void enterSupplier1(Supplier s)
	{
		System.out.println("Enter supplier id:");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter Supplier name:");
		s.setSname(sc.next());
		
		System.out.println("Enter supplier phone number:");
        s.setPhoneNumber(sc.next());
        
        System.out.println("Enter the number of items you supply:");
        int n = sc.nextInt();
        

         Item itm[]= new Item[n];
        
        for(int i=0;i<n;i++)
        {
        	itm[i]= new Item();
        	
        	System.out.println("Enter item id:");
        	itm[i].setId(sc.nextInt());
        	
        	System.out.println("Enter item name:");
        	itm[i].setName(sc.next());
        	
        	System.out.println("Enter item price:");
        	itm[i].setUnitPrice(sc.nextDouble());
        	
        	
        }
      
        s.setItem(itm);
		
		
	}
	
	public static void printSupplier(Supplier[] sup)
	{
		for(Supplier st:sup)
	      {
	    	  System.out.println(st.getSid()+"  "+st.getSname()+"  "+st.getPhoneNumber());
	    	  for(Item i:st.getItem())
	    	  {
	    		  System.out.println(i);
	    	  }
	    	  
	    	  System.out.println("=====================================================");
	      }
		
	}
	
	public static void getSupplierNames(Supplier [] st)
	{
		System.out.println("=================================================");
		System.out.println("Enter the  item name to search:");
		String iname= sc.next();
		
		for(Supplier s:st)
		{
			for(Item i:s.getItem())
			{
				if(i.getName().equals(iname))
				{
					System.out.println(s.getSname()+"  "+s.getPhoneNumber());
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
      
      Supplier sup[]= new Supplier[3];
      for(int i=0;i<sup.length;i++)
      {
    	  sup[i]= new Supplier();
    	  enterSupplier1(sup[i]);
      }
     
     
      getSupplierNames(sup);
      
      
      

	}

}





