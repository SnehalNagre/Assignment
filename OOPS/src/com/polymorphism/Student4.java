package com.polymorphism;

public class Student4 {
	int id;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}

	public static void main(String[] args) {
		Student4 s=new Student4();
        Student4 s1=new Student4();
        
      /*  s.setId(11);
        s1.setId(21);*/
        
        System.out.println("Id of first :" +s.getId());
        System.out.println("Id of second :" +s1.getId());
	}

}
