package com.custommap;

import java.util.Objects;

public class Book {

	private int bid;
	private String bookName;
	private float price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bookName, float price) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.price = price;
	}
	/*
	public int hashcode()
	{
		return Objects.hash(bid,bookName,price);
	}
	
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
		   return false;
		Book b= (Book) obj;
		
		return ((bid==b.bid)&&(Objects.equals(bookName, b.bookName))
		&& Float.floatToIntBits(price) == Float.floatToIntBits(b.price));
	}
	*/
	
	
	public int getBid() {
		return bid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bid, bookName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bid == other.bid && Objects.equals(bookName, other.bookName)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	
}
