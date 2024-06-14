package com.workwin.art.model;

import java.sql.Date;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class Transactions {
	
	
	private int accountnum;
	private String refOrcheckNo;
	private Date date;
	private float debit;
	private float credit;
	
	
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public String getRefOrcheckNo() {
		return refOrcheckNo;
	}
	public void setRefOrcheckNo(String refOrcheckNo) {
		this.refOrcheckNo = refOrcheckNo;
	}
		public float getDebit() {
		return debit;
	}
	public void setDebit(float debit) {
		this.debit = debit;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	
	
	

}
