package com.containmentassignment;

public class Person {
	private String name;
	private String gender;
	private int age;
	private Address adress;
	
	Person()
	{
		
	}
	Person(String name,String gender,int age,Address adress)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.adress=adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public String toString() 
	{
		return name+""+gender+""+age+""+adress; 
	}
	
}
