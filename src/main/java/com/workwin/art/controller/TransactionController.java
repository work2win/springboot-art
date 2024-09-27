package com.workwin.art.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workwin.art.model.Transaction;
import com.workwin.art.repository.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@GetMapping("/all")
	public List<Transaction> getTransaction(){
		return transactionRepository.findAll();
	}

}
