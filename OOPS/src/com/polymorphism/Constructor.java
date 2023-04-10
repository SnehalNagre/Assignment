package com.polymorphism;

public class Constructor {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub */
		public class Cycle {
		    private int accountNo;
		    private int noOfWheels;

		    public Cycle() {
		        this(0, 0);
		    }

		    public Cycle(int accountNo, int noOfWheels) {
		        this.accountNo = accountNo;
		        this.noOfWheels = noOfWheels;
		    }

		    public Cycle(int accountNo) {
		        this();
		        System.out.println("I am another constructor");
		        this.accountNo = accountNo;
		    }

		    public int getAccountNo() {
		        return accountNo;
		    }

		    public void setAccountNo(int accountNo) {
		        this.accountNo = accountNo;
		    }

		    public int getNoOfWheels() {
		        return noOfWheels;
		    }

		    public void setNoOfWheels(int noOfWheels) {
		        this.noOfWheels = noOfWheels;
		    }
		}


	}


