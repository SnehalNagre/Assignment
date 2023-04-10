package com.customtreemap;

public class Order {
	private int orderid;
	private int orderName;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderid, int orderName) {
		super();
		this.orderid = orderid;
		this.orderName = orderName;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getOrderName() {
		return orderName;
	}
	public void setOrderName(int orderName) {
		this.orderName = orderName;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderName=" + orderName + "]";
	}
	
	

}
