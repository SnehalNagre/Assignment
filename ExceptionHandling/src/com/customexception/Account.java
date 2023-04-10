package com.customexception;

 class Acc {
	int id;
	String name;
	float salary;
	float balance;
	
	Acc()
	{
		
	}
	Acc(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float amount) 
	{
		this.balance+=amount;
		System.out.println("Amount deposited:"+amount);
		System.out.println("current balance:"+this.balance);
	}
	
	public void withdraw(float amount) 
	{
		if(this.balance-amount<0) 
		{
			try 
			{
			throw new InsuffBalanceException("Balance is too low");
		
			}catch(InsuffBalanceException e) 
			{
			System.out.println(e);
		}
     
	}else 
		{
			this.balance+=amount;
			
			System.out.println("Amount withdrawn:"+amount);
			System.out.println("current Balnce:"+this.balance);
		}
			
	}	
	@Override
	public String toString()
	{
		return "Acc [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
  }
 
	public class Account{
	public static void main(String[] args) 
	{
		Account a1=new Account();
		//a1.setId(101);
		//a1.setName("Snehal");
		//a1.setSalary(900f);
		
		

	}


 }
