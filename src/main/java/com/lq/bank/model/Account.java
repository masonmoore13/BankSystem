package com.lq.bank.model;

import com.lq.bank.enums.AccountType;

public class Account {
	private AccountType type;
	private String label;
	private double balance;
	private int id;
	private Branch branchId;
	private Customer customerId;

	public Account(AccountType checking, String label, double balance, int id, Branch branchId, Customer customerId) {
		super();
		this.type = checking;
		this.label = label;
		this.balance = balance;
		this.id = id;
		this.branchId = branchId;
		this.customerId = customerId;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Branch getBranchId() {
		return branchId;
	}

	public void setBranchId(Branch branchId) {
		this.branchId = branchId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Branch getBranch() {
		return branchId;
	}

}
