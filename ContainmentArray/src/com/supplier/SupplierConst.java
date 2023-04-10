package com.supplier;

public class SupplierConst {

	public static void main(String[] args) {

           
      
      Supplier s[]= new Supplier[3];
      
      Item i1[]= new Item[3];
      
      i1[0]= new Item(1,"Apple",80);
      i1[1]= new Item(2,"Guava",78);
      i1[2]= new Item(3,"Oranges",50);
      
      s[0]= new Supplier(101,"Jordan","78968544",i1);
      
      Item i2[]= new Item[2];
      i2[0]= new Item(1,"Pineapple",90);
      i2[1]= new Item(2,"Apple",75);
      
      s[1]= new Supplier(102,"Jenny","8685747",i2);
      
      Item i3[]= new Item[2];
      i3[0]= new Item(1,"Oranges",70);
      i3[1]= new Item(2,"Kiwi",75);
      
      s[2]= new Supplier(103,"Joy","57646536",i3);
      
      for(Supplier st:s)
      {
    	  System.out.println(st.getSid()+"  "+st.getSname()+"  "+st.getPhoneNumber());
    	  for(Item i:st.getItem())
    	  {
    		  System.out.println(i);
    	  }
    	  
    	  System.out.println("=====================================================");
      }
      
      

	}

}

