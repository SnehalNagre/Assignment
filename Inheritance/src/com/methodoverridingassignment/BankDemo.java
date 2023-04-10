package com.methodoverridingassignment;

class Bank {
    protected double rateOfInterest = 2.0;

    public void displayInterestRate() {
        System.out.println("interest for a account is " + rateOfInterest + "%.");
    }
}

class SavingsAccount extends Bank {
    protected double rateOfInterest = 3.0;

    public void displayInterestRate() {
        System.out.println("interest for a savings account is " + rateOfInterest + "%.");
    }
}

class CurrentAccount extends Bank {
    protected double rateOfInterest = 5.0;
    
    
    public void displayInterestRate() {
        System.out.println("interest for a current account is " + rateOfInterest + "%.");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        bank.displayInterestRate();     
        savings.displayInterestRate();  
        current.displayInterestRate();  
    }
}

