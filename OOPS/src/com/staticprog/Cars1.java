package com.staticprog;

public class Cars1 {
	 private String model;
	 static int totalCarSold;
	 
	 public Cars1(String model)
	 {
		this.model=model;
		totalCarSold++;
	 }
	 public String getModel() {
		 return model;
	 }

	public static void main(String[] args) {
		Cars1 c1=new Cars1("abc");
		Cars1 c2=new Cars1("abc");
		System.out.println("before changing values:"+totalCarSold);
        
		c1.totalCarSold=10;
		
		System.out.println("after changing values:" +totalCarSold);
	}

}
