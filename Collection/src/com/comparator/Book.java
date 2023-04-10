package com.comparator;

public class Book implements Comparable<Book>{
	
	private int id;
	private String name;
	private float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book b) {
		
		if(this.id==b.id)
			return 0;
		else
			if(this.id>b.id)
				return 1;
			else 
				return -1;


	}
	
	
	

}
