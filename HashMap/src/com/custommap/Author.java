package com.custommap;

public class Author {
	
	private int id;
	private String aname;
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Author(int id, String aname) {
		super();
		this.id = id;
		this.aname = aname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", aname=" + aname + "]";
	}
	
	

}
