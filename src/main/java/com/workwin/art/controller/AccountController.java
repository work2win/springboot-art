package com.workwin.art.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workwin.art.model.Account;
import com.workwin.art.model.AccountTransfer;
import com.workwin.art.repository.AccountRepository;
import com.workwin.art.service.AccountService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/sendMoney")
	public void sendMoney(@RequestBody AccountTransfer accountTransfer) {
		
		
		long fromAccountNum = accountTransfer.getFromAccount();
		long toAccount =  accountTransfer.getToAccount();
		long balance = accountTransfer.getBalance();
		
		
	    accountRepository.deposit(toAccount, balance);
	    accountRepository.withdraw(fromAccountNum, balance);
	    
	}
	
	@GetMapping("/accounts/{id}")
	public Account getByAccountId(@PathVariable int id) {
		System.out.println(accountRepository.findById(id).orElse(null));
		return accountRepository.findById(id).orElse(null);
	}
	
	@GetMapping("/accounts")
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}

}
