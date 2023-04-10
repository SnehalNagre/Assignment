package com.encapsulation;

public class Accountobject {
	
	private int accNumber;
	private String accName;
	private float balance;
	private String bankName;
	private int panCard;
	

	Accountobject()
	{
		
	}
	
	Accountobject(int accNumber, String accName, String bankName)
	{
		System.out.println("Constructor 1");
		this.accName=accName;
		this.accNumber=accNumber;
		this.bankName=bankName;
	}
	

	Accountobject(int accNumber, String accName, float balance, String bankName,int panCard)
	{
		this(accNumber,accName,bankName);
		System.out.println("Constructor 2");
		this.balance=balance;
		
	}
	
	public void setAccNumber(int accNumber)
	{
		this.accNumber=accNumber;
	}
	
	public int getAccNumber()
	{
		return accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setPanCard(String pan) {
		this.panCard=panCard;
		
	}

	
	void display()
	{
		System.out.println(accNumber+" "+accName+" "+bankName+" "+balance);
	}
	
	public String toString()
	{
		return accNumber+" "+accName+" "+bankName+"  :"+balance;
	}

	
}
