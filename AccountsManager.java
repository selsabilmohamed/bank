package com.bank;

import java.util.Scanner;

public class AccountsManager {
	Scanner scan = new Scanner(System.in);
	private Accounts[] accounts;
	private final int capacity;
	private int current;

	public AccountsManager(int capacity) {
		this.capacity = capacity;
		accounts = new Accounts[capacity];
		current = 0;
	}

	// returns the account number of the new account
	// or -1 if no account could be made
	public int addAccount(String name) {
		if (current >= capacity) {
			return -1;
		}
		accounts[current] = new Accounts(name, current, 0);
		return current++;
	}

	public Accounts getAccount(int number) {
		if (number >= current || number < 0) {
			return null;
		}
		return accounts[number];
	}
	
	public int userOptions() {
		System.out.println("Choose an option: ");
		System.out.println("1= Create New Account");
		System.out.println("2= Make a Deposit");
		System.out.println("3= Make a Withdrawal");
		System.out.println("4= Add Interest");
		System.out.println("5= Get Account Info");
		
		return scan.nextInt();
	}
}
