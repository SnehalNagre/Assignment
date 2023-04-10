package com.containmentassignment;

public class PersonData {

	public static void main(String[] args) {
		Person p1=new Person("ani","female",24,new Address("Pune","Maharastra","India"));
		Person p2=new Person("joy","male",25,new Address("Surat","Gujarat","India"));
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
