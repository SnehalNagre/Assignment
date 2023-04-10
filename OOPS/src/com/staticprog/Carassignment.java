package com.staticprog;
  class Cars{
	  private String model;
	     static int totalCarSold;
	     
	    
		public Cars(String model) {
	    	 this.model=model;
	    	 totalCarSold++;
	     }
	     
	     public String getModel(String model) {
	    	 return model;
	     }
  }
public class Carassignment {

	public static void main(String[] args) {
		Cars c1=new Cars("abc");
		Cars c2=new Cars("abc");
		Cars c3=new Cars("abc");
		System.out.println("before changing value" +Cars.totalCarSold);//if we want direct call by class name then mke variable static
		Cars.totalCarSold=10;
		System.out.println("after changing value:" +Cars.totalCarSold);
	}

}
