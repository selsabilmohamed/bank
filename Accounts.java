package com.bank;

import java.text.NumberFormat;
import java.util.Scanner;

public class Accounts {

	Scanner scan = new Scanner(System.in);
	AccountsManager am = new AccountsManager(30);
	
	private final double RATE = 0.035;
	private long acctNumber;
	private double balance;
	private String name;

	public Accounts(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}


	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public long getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(long acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getAcctName() {
		return name;
	}

	public void setAcctName(String acctName) {
		this.name = acctName;
	}

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return ("Account Number: " +acctNumber + "\n" +"Account Name: "+ name + "\n" +"Balance: "+ fmt.format(balance) + "\n");
	}

	public String createAccount(String name, long number, double balance) {
		return name;
	}

}
