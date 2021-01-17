package com.bilalbasim;

public class Account {
   
	    int acc_no;
	    String name;
	    float amount;

	    // Method to initialize object
	    void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	    }

	    // deposit method
	    void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	    }

	    // withdraw method
	    void withdraw(float amt) {
		if (amount < amt) {
		    System.out.println("Insufficient Balance");
		} else {
		    amount = amount - amt;
		    System.out.println(amt + " withdrawn");
		}
	    }

	    // method to check the balance of the account
	    void checkBalance() {
		System.out.println("Balance is: " + amount);
	    }

	    // method to display the values of an object
	    void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	    }
	    
	}

	//Creating a test class to deposit and withdraw amount  
	class Main {
	    public void main(String[] args) {  
		     Account a1=new Account();
	            a1.insert(90000, "Bilal", 3000);
		    a1.display();
		    a1.checkBalance();
		    a1.deposit(96000);
		    a1.checkBalance();
		    a1.withdraw(25000);
		    a1.checkBalance();
	
	    }
	}


