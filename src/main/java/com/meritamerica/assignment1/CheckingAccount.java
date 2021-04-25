package com.meritamerica.assignment1;


public class CheckingAccount {
	
	private double openingBalance;
	private double balance;
	private double interestRate = 0.0001;
	
	public CheckingAccount() {
		
	}
	
	CheckingAccount(double openingBalance){
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

	boolean withdraw(double amount) {
		boolean flag = false;
		if(amount != 0 && amount <= balance) {
			balance -= amount;
			flag = true;
		}
		
		return flag;
	}
	
	boolean deposit(double amount) {
		boolean flag=false;
		if(amount >= 0.0)
		{
			balance += amount;
			flag = true;
		}
		return flag;
	}
	
	double futureValue(int years) {
		double futureAmount = 0.0;
		if(years >=1) {
			futureAmount = balance * (Math.pow(1 + interestRate,years));
		}
		else
			System.out.println("Please enter valid value for number of years");
		return futureAmount;
	}
	
	@Override
		public String toString() {
			
			return 	"Checking Account Balance: " + getBalance() + "\n" +
					"Checking Account Interest Rate: " + getInterestRate() + "\n" +
					"Checking Account Balance in 3 years: " + futureValue(3);
		}
	
}