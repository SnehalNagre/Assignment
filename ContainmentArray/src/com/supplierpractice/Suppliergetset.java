package com.supplierpractice;

import java.util.Scanner;

public class Suppliergetset {
	static Scanner sc=new Scanner(System.in);
	public static void entersupplier(Supplier s) 
	{
		System.out.println("enter supplier id:");
		s.setSid(sc.nextInt());
		
		System.out.println("enter supplier name:");
		s.setSname(sc.next());
		
		System.out.println("enter supplier phone no:");
		s.setPhoneNumber(sc.next());
		
		System.out.println("enter the items you supply:");
		int n=sc.nextInt();
		
		s.setItem(new Item[n]);
		for(int i=0;i<n;i++) 
		{
		   s.getItem()[i]=new Item();
		  
		   System.out.println("enter item id:");
		   s.getItem()[i].setId(sc.nextInt());
		   
		   System.out.println("enter item name:");
		   s.getItem()[i].setName(sc.next());
		   
		   System.out.println("enter item price:");
		   s.getItem()[i].setUnitPrice(sc.nextDouble());
		}
		
		
	}
	public static void printSupplier(Supplier[] sup) 
	{
		for(Supplier st:sup) 
		{
			System.out.println(st.getSid()+"  "+st.getSname()+"  "+st.getPhoneNumber());
			for(Item i:st.getItem()) {
				System.out.println(i);
			}
			System.out.println("==================================");
		}
			
	}
	public static void getSuppliersname(Supplier[] st) 
	{ 
		System.out.println("======================");
		System.out.println("enter the item name to search :");
		String iname=sc.next();
		for(Supplier s1:st) 
		{
			for(Item i1:s1.getItem()) 
			{
				if(i1.getName().equals(iname)) 
				{
					System.out.println(s1.getSname()+" "+s1.getPhoneNumber());
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Supplier sup[]=new Supplier[3];
		
		for(int i=0;i<sup.length;i++) 
		{
			sup[i]=new Supplier();
			entersupplier(sup[i]);
		}
         getSuppliersname(sup);
	}

}
