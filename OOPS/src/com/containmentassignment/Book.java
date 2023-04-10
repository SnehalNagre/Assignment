package com.containmentassignment;

public class Book {
	private int id;
	private String name;
	private Author author;
	
	public Book() {
		
	}
	
	public Book(int id,String name,Author author)
	{
		this.id=id;
		this.name=name;
		this.author=author;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public String toString() {
		return id+""+name+""+author;
	}

}
