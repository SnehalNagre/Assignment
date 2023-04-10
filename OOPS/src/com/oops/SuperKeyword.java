package com.oops;

class SuperKeyword1
{
  int value;
  {
	  value=10;
  }
  
  void display()
  {
	  System.out.println("Welcome");
  }

}

class Child extends SuperKeyword1
{
  int value;
  {
	  value=100;
  }
  
   void  show()
  {
	  System.out.println("Parent:"+super.value);
	  System.out.println("Child:"+value);
	  
  }
  
  void display()
  {
	  super.display();
	  System.out.println("Hello");
  }
  
  

}

public class SuperKeyword {

	public static void main(String[] args) {

     Child c1 = new Child();
     c1.show();
     c1.display();


     

	}

}

