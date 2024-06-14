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
@Table(name = "accountsavings")
public class AccountSavings {
	
	
	@Id
	@GeneratedValue
	private long accountnum;
	private String name;
	private long balance;
	
	public AccountSavings() {}
	
	public AccountSavings(long accountnum, String name, long balance) {
		super();
		this.accountnum = accountnum;
		this.name = name;
		this.balance = balance;
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
	
	
	

}
