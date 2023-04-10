package com.encapsulation;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private float price;
	
	public void setId(int id) {
		this.bookId=id;
	}
       public int getId() 
       {
    	return bookId;
       }
       public void setBookName(String bookName) 
       {
  		this.bookName=bookName;
  	   }
       public String getBookName() 
       {
      	 return bookName;
       }
       public void setAuthor(String author) 
       {
    	   this.author=author;
       }
      	
       public String getAuthor() 
        {
    	   return author;
    	}
       public void setPrice(float price)
       {
    	   this.price=price;
       }
       public float getPrice()
       {
    	  return price;
       }
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
       
}
