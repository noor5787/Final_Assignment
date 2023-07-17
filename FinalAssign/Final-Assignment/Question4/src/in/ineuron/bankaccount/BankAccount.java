package in.ineuron.bankaccount;

import java.util.Scanner;

public class BankAccount {

	private int bankid;
	private int balance;
	private String name;

	public BankAccount(int bankid, int balance, String name) {
		this.bankid = bankid;
		this.balance = balance;
		this.name = this.name;
	}

	public String deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter amount for deposit");
		int amount = scanner.nextInt();
		balance = balance + amount;
		return "SUCESSFULLY DEPOSITED THE MONEY";

	}

	public String withdraw() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter amount for withdrawal");
		int amount = scanner.nextInt();
		balance = balance - amount;
		return "SUCESSFULLY WITHDRAWN THE MONEY";
	}

	public int checkbalance() {
		return balance;
	}
}
