package com.meritamerica.assignment1;

/*
this class is defined for user's Savings Account

 */

public class SavingsAccount {
	
	private double openingBalance;
	private double balance;
	private double interestRate = 0.01;
	
	public SavingsAccount() {
	
	}
	 SavingsAccount(double openingBalance){
		 this.balance = openingBalance;
	 }
	
	 public double getOpeningBalance() {
		return openingBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	 // This method  will receive the amount to be withdrawn and will return boolean value as output
	boolean withdraw(double amount) {
		boolean flag = false;
		if(amount != 0 && amount <= balance) {
			balance -= amount;
			flag = true;
		}
		
		return flag;
	}
	// This method  will receive the amount to be deposited and will return boolean value as output.
	boolean deposit(double amount) {
		boolean flag = false;
		if(amount >= 0.0) {
			balance += amount;
			flag = true;
		}
		return flag;
	}
	
	// this method will calculate the future value for the number of years passed as an argument
	double futureValue(int years) {
		double futureAmount = 0.0;
		if(years >=1) {
			futureAmount = balance * (Math.pow(1 + interestRate,years));
		}
		else
			System.out.println("Please enter valid value for number of years");
		return futureAmount;
	}
	 // to display the output for the object in specified format
	@Override
		public String toString() {
			
			return "Savings Account Balance: " + getBalance() + "\n" +
					"Savings Account Interest Rate: " + getInterestRate() + "\n" +
					"Savings Account Balance in 3 years: " + futureValue(3);
		}
}