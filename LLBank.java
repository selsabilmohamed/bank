package com.bank;

import java.util.Scanner;

public class LLBank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AccountsManager am = new AccountsManager(30);
		// Accounts acc = new Accounts(null, 0, 0);

		int userChoice = am.userOptions();

		while (userChoice == 1) {

			System.out.println("Enter account name: ");
			String acctName = scan.next();
			int acctNumber = am.addAccount(acctName);
			System.out.println("Your account number is " + acctNumber);

			userChoice = am.userOptions();

		}
		while (userChoice == 2) {
			// deposit
			System.out.println("Enter account number:");
			int acctNumber = scan.nextInt();

			if (!(am.getAccount(acctNumber) == null)) {
				System.out.println("Enter deposit amount:");
				int deposit = scan.nextInt();
				am.getAccount(acctNumber).deposit(deposit);

				double balance = am.getAccount(acctNumber).getBalance();
				System.out.println("New balance:" + balance);
			} else {
				System.out.println("Invalid acc number");
			}

			userChoice = am.userOptions();

		}
		while (userChoice == 3) {
			// withdrawal
			System.out.println("Enter account number: ");
			int acctNumber = scan.nextInt();

			if (!(am.getAccount(acctNumber) == null)) {
				System.out.println("Enter withdrawl amount:");
				int withrawl = scan.nextInt();
				if (am.getAccount(acctNumber).getBalance() < withrawl) {
					System.out.println("Invalid transaction, not enough funds");
				} else {
					am.getAccount(acctNumber).withdraw(withrawl);
					double balance = am.getAccount(acctNumber).getBalance();
					System.out.println("New balance:" + balance);
				}
			} else {
				System.out.println("Invalid acc number");
			}

			userChoice = am.userOptions();
		}
		while (userChoice == 4) {
			System.out.println("Enter account number: ");
			int acctNumber = scan.nextInt();

			if (!(am.getAccount(acctNumber) == null)) {
				am.getAccount(acctNumber).addInterest();
				double balance = am.getAccount(acctNumber).getBalance();
				System.out.println("New balance:" + balance);
			} else {
				System.out.println("Invalid acc number");
			}

			userChoice = am.userOptions();

		}
		while (userChoice == 5) {
			System.out.println("Enter account number: ");
			int acctNumber = scan.nextInt();

			if (!(am.getAccount(acctNumber) == null)) {
				am.getAccount(acctNumber).addInterest();
				String acctInfo = am.getAccount(acctNumber).toString();
				System.out.println(acctInfo);
			} else {
				System.out.println("Invalid acc number");
			}

			userChoice = am.userOptions();

		}

	}

}
