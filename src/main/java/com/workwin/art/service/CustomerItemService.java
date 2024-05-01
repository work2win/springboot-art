package com.workwin.art.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.workwin.art.model.CustomerItem;
import com.workwin.art.repository.CustomerItemRepository;

@Service
public class CustomerItemService {
	
	@Autowired
	private CustomerItemRepository customerItemRepository;
	
	
	public List<CustomerItem> getCustomerItems(){
		return customerItemRepository.findAll();		
		
	}
	
	public CustomerItem getCustomerItem(int id) {
		return customerItemRepository.findById(id).orElse(null);
	}
	
	public CustomerItem getCustomerItembyName(String name) {
		return customerItemRepository.findByName(name);
	}

}
