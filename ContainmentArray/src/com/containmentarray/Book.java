package com.containmentarray;

public class Book {
	private int bId;
	private String bName;
	private Author author;
	
	Book()
	{
		
	}
	Book(int bId,String bName,Author author)
	{
		this.bId=bId;
		this.bName=bName;
		this.author=author;
	}
	public void setBid(int bId) {
		this.bId=bId;
	}
	public int getBid() {
		return bId;
	}
	public void setBname(String bName) {
		this.bName=bName;
	}
	public String getBname() {
		return bName;
	}
	public void setAuthor(Author author) 
	{
		this.author=author;
	}
	public Author getAuthor() {
		return author;
	}
	public String toString() {
		return bId+""+bName+""+author;
	}

}
