package com.workwin.art.model;

public class AccountTransfer {
	
	private int fromAccount;
	private int toAccount;
	private long balance;
	
	
	private AccountTransfer() {}
	
	private AccountTransfer(int fromAccount, int toAccount, long balance) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.balance = balance;
	}
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountTransfer [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", balance=" + balance
				+ "]";
	}
	
	

}
