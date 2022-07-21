package com.lq.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Branch {
	@Column
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public Branch(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Branch(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getBranchId() {
		return id;
	}

	public Object getBranchName() {
		return name;
	}

}
