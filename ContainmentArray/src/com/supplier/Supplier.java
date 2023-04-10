package com.supplier;

import java.util.Arrays;

public class Supplier {
	private int sid;
	private String sname;
	private String phonenumber;
	private Item item[];
	
	Supplier()
	{
		
	}
	Supplier(int sid,String sname,String phonenumber,Item item[])
	{
	   this.sid=sid;
	   this.sname=sname;
	   this.phonenumber=phonenumber;
	   this.item=item;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
	public void setPhoneNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}
	public String toString() {
		return sid+" "+sname+" "+phonenumber+" "+Arrays.toString(item);
	}
}
	