package com.encapsulation;

public class Account {
	int accountNo;
	String accountName;

	
	public Account(int accno,String accname)
	{
		this.accountNo=accno;
		this.accountName=accname;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	public int getAccountname() 
	{
		return accountNo;
	}
	public void printDetails() 
	{
		System.out.println("Accountno:" +accountNo);
		System.out.println("Accountname:" +accountName);
	}

	public static void main(String[] args) {
		Account a1=new Account(1234,"snehal");
		Account a2=new Account(2345,"neha");
		
		System.out.println("account1 detail:");
		a1.printDetails();
		
		System.out.println("account2 detail:");
		a2.printDetails();


	}
	

}
