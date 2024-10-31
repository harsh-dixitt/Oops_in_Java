package com.sunbeam.p2;

class BankAccount{
	final int accNo ;
	static int generate_accNo = 1000;
	
	String name;
	double balance;
	
	//Object Initializer
	{
		// accNo = ++generate_accNo;
	}
	
	BankAccount() {
		accNo = ++generate_accNo;
	}

	public BankAccount(String name, double balance) {
		accNo = ++generate_accNo;
		this.name = name;
		this.balance = balance;
	}

	public void displayDetails() {
		System.out.println("Accno - " + accNo);
		System.out.println("Name - " + name);
		System.out.println("Balance - " + balance);
	}

	public static void displayAllAccounts(BankAccount... accounts) {
		for (BankAccount bankAccount : accounts)
			bankAccount.displayDetails();

	}
}

public class Program04 {

	public static void main(String[] args) {
		BankAccount accounts[] = new BankAccount[100];
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("Anil", 10000);
		BankAccount b3 = new BankAccount("Mukesh", 20000);

		// BankAccount.displayAllAccounts(accounts);
		BankAccount.displayAllAccounts(b1, b2, b3);

	}

}


