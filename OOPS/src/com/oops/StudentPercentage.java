package com.oops;

public class StudentPercentage {
	int marks1;
	int marks2;
	int marks3;
	float per;
	
	void insertmark(int m1,int m2,int m3) 
	{
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
    void calPercentage() 
    {
    	per=marks1+marks2+marks3/3;
      System.out.println("percentage is:"+per);
      
    }
    void result() {
    	if(per>=80) {
    		System.out.println("a Grade");
    	}if(per>=70) {
    		System.out.println("B Grade");
    	}else {
    		System.out.println("fail");
    	}
    		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 StudentPercentage sp=new  StudentPercentage();
	   sp.insertmark(50,50,50);
       sp.calPercentage();
       sp.result();
	}

}
