package in.ineuron.BankApp;

import java.util.Scanner;

import in.ineuron.bankaccount.BankAccount;

public class BankApp {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount(123, 2000, "faf");

		Scanner sc = new Scanner(System.in);
		System.out.println("Dear Customer Welcome to your Bank Account");
		System.out.println("Choose 1 for Deposit");
		System.out.println("Choose 2 for Withdrawal");
		System.out.println("Choose 3 for BalanceEnquiry");
		System.out.println("Choose 4 for Exit the Console");
		String choice = sc.next();

		if (choice.equals("1")) {
			System.out.println(bankAccount.deposit());
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dear Customer Welcome to your Bank Account");
			System.out.println("Choose 1 for Deposit");
			System.out.println("Choose 2 for Withdrawal");
			System.out.println("Choose 3 for BalanceEnquiry");
			System.out.println("Choose 4 for Exit the Console");
			String choice1 = scanner.next();

		} else if (choice.equals("2")) {
			System.out.println(bankAccount.withdraw());
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dear Customer Welcome to your Bank Account");
			System.out.println("Choose 1 for Deposit");
			System.out.println("Choose 2 for Withdrawal");
			System.out.println("Choose 3 for BalanceEnquiry");
			System.out.println("Choose 4 for Exit the Console");
			String choice1 = scanner.next();

		} else if (choice.equals("3")) {
			System.out.println(bankAccount.checkbalance());
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dear Customer Welcome to your Bank Account");
			System.out.println("Choose 1 for Deposit");
			System.out.println("Choose 2 for Withdrawal");
			System.out.println("Choose 3 for BalanceEnquiry");
			System.out.println("Choose 4 for Exit the Console");
			String choice1 = scanner.next();

		} else if (choice.equals("4")) {
			System.out.println("Thanks for using Application");
			System.exit(0);
		} else {
			System.out.println("Invalid entry!");
		}

	}
}
