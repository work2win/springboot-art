package com.workwin.art.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
	
	@Id
	@GeneratedValue
	private int id;
	private long accountnum;
	private String name;
	private long balance;
	
	public Account() {}
	private Account(int id, long accountnum, String name, long balance) {
		super();
		this.id = id;
		this.accountnum = accountnum;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(long accountnum) {
		this.accountnum = accountnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountnum=" + accountnum + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
}