package com.encapsulation;

public class Account2 {
	int accId;
	int accountNo;
    String accountName;
    double balance;
    String bankName;
    
    public Account2(int accId,int accountno,String accountname,double balance,String bankName)
    {   
    	this.accId=accId;
    	this.accountNo=accountno;
    	this.accountName=accountname;
    	this.balance=balance;
    	this.bankName=bankName;
    	   	
   
    }
     public int getAccoutnNo() 
     {
    	 return accountNo;
     }
     public String getAccountName() 
     {
    	 return accountName;
     }
     public double getBalance() 
     {
    	 return balance;
     }
     public String getbankName() {
    	 return bankName;
     }
     public void printDetails()
     {
    	System.out.println("accountno:" +accountNo); 
    	System.out.println("accountname:" +accountName);
    	System.out.println("balance:" +balance);
    	System.out.println("bankName:" +bankName);
     }
	public static void main(String[] args) {
		Account2 a=new Account2(10201,2112, "snehal",20000, "abc");
		System.out.println("print acc details:" );
	    a.printDetails();

	}
}	


