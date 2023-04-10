package com.staticprog;
   class Car{
	   private String model;
	   static int totalCarSold;
	   
	   public Car(String model) {
		   this.model=model;
		   totalCarSold++;
	   }
	   
	   public String getModel() {
		   return getModel();
	   }
   }



public class Main {

	public static void main(String[] args) {
		Car c1=new Car("abc");
		Car c2=new Car("bcd");
		Car c3=new Car("dce");
	System.out.println("total cars sold:" +Car.totalCarSold);
	}

}
