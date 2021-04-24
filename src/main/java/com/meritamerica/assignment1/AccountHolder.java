package com.meritamerica.assignment1;

public class AccountHolder {

	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;


	public AccountHolder() {

		
	}

	AccountHolder(String firstName, String middleName, String lastName,
			String ssn, double checkingAccountOpeningBalance, 
			double savingsAccountOpeningBalance){

		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getCheckingAccountOpeningBalance() {
		return checkingAccountOpeningBalance;
	}

	public double getSavingsAccountOpeningBalance() {
		return savingsAccountOpeningBalance;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	@Override
	public String toString() {
		
		return "Name: "+getFirstName() +" "+ getMiddleName() +" "+ getLastName() + "\n"+
				"SSN: "+ getSsn() + "\n" +
				"Checking Account Balance:"+getCheckingAccountOpeningBalance() + "\n" +
				"Checking Account Interest Rate: " + checkingAccount.getInterestRate() + "\n" +
				"Checking Account Balance in 3 years: " +checkingAccount.futureValue(3)+ "\n" +
				"Savings Account Balance: " +getSavingsAccountOpeningBalance() + "\n" +
				"Savings Account Interest Rate: " + savingsAccount.getInterestRate() +"\n" +
				"Savings Account Balance in 3 years: " + savingsAccount.futureValue(3);
	}
	
	/*
	 * String toString() Sample output: Name: John James Doe SSN: 123-45-6789
	 * Checking Account Balance: $100 Checking Account Interest Rate: 0.0001
	 * Checking Account Balance in 3 years: $100.03 Savings Account Balance: $1000
	 * Savings Account Interest Rate: 0.01 Savings Account Balance in 3 years:
	 * $1030.03
	 */

}