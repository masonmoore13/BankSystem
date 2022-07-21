package com.lq.bank.model;

public class Customer {
	private String name;
	private String family;
	private int age;
	private int id;
	private Account account;
	private Branch branch;

	public Customer(String name, String family, int age, int id, Account account, Branch branch) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
		this.id = id;
		this.account = account;
		this.branch = branch;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
