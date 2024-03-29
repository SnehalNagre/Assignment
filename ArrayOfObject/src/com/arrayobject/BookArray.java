package com.arrayobject;

public class BookArray {
	private int bookId;
	private String bookName;
	private float bookPrice;
	
	BookArray()
	{
		
	}
	BookArray(int bookId,String bookName,float bookPrice)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String toString() {
		return bookId+""+bookName+""+bookPrice;
	}

}
