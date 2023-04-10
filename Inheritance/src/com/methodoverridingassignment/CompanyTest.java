package com.methodoverridingassignment;


	class Company {
	    public void address() {
	        System.out.println("This is the company's address.");
	    }
	}

	class eBay extends Company {
	    public void address() {
	        System.out.println("This is eBay's address.");
	    }
	}

	public class CompanyTest {
	    public static void main(String[] args) {
	        Company company = new Company();
	        eBay ebay = new eBay();

	        company.address(); 
	        ebay.address();      
	    }
	}
	


