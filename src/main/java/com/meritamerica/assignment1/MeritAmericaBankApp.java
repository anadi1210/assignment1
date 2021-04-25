package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		AccountHolder accountHolder1 = new AccountHolder("Abc", "Def", "Ghi", "123-456-7890",100,1000);
		
		System.out.println(accountHolder1);
		
		CheckingAccount checkingAccount1 = accountHolder1.getCheckingAccount();
		SavingsAccount savingsAccount1 = accountHolder1.getSavingsAccount();
		boolean flag1 = checkingAccount1.deposit(500);
		if(!flag1) {
			System.out.println("Incorrect amount entered for deposit");
		}
		boolean flag2 = savingsAccount1.withdraw(800);
		if(!flag2) {
			System.out.println("Incorrect amount entered for withdraw");
		}
		System.out.println("---------------------------");
		System.out.println(checkingAccount1);
		System.out.println("---------------------------");
		System.out.println(savingsAccount1);
		System.out.println("---------------------------");
		AccountHolder accountHolder2 = new AccountHolder("John", "James", "Doe","985-746-2312",200,500);
		
		
		
		CheckingAccount checkingAccount2 = accountHolder2.getCheckingAccount();
		SavingsAccount savingsAccount2 = accountHolder2.getSavingsAccount();
		
		boolean flag3 = checkingAccount2.deposit(-500);
		if(!flag3) {
			System.out.println("Incorrect amount entered for deposit");
		}
		boolean flag4 = savingsAccount2.withdraw(600);
		if(!flag4) {
			System.out.println("Incorrect amount entered for withdraw");
		}
		System.out.println("---------------------------");
		System.out.println(accountHolder2);
	}
}