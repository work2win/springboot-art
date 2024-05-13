package com.workwin.art.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workwin.art.model.AccountTransfer;
import com.workwin.art.model.CustomerItem;
import com.workwin.art.service.CustomerItemService;
import com.workwin.art.repository.CustomerItemRepository;

@CrossOrigin
@RestController
public class CustomerItemController {
	
	@Autowired
	private CustomerItemService customerItemService;
	
	@Autowired
	private CustomerItemRepository customerItemRepository; 
	
	@GetMapping("/customers")
	public List<CustomerItem> getCustomerItems(){
		return customerItemService.getCustomerItems();
	}
	
	@GetMapping("/customers/{id}")
	public CustomerItem getCustomerItem(@PathVariable int id) {
		System.out.println("*** "+id);
		return customerItemService.getCustomerItem(id);
	}
	
	@GetMapping("/customer/{name}")
	public CustomerItem getCustomerItemByName(@PathVariable String name) {
		System.out.println("### "+name);
		return customerItemService.getCustomerItembyName(name);
	}
	
	@PostMapping("/customers")
	public CustomerItem createCustomerItem( @Valid @RequestBody CustomerItem customerItem) {
		System.out.println("### create"+customerItem.getId());
		//CustomerItem newItem = customerItemRepository.save(customerItem);		
		return customerItemRepository.save(customerItem);
	}
	
		
	@PutMapping(("/customers/{id}"))
	public ResponseEntity<CustomerItem> updateCustomerItem(@PathVariable int id, @RequestBody CustomerItem customerItem){
		
		System.out.println(customerItem+"id"+id);
		CustomerItem cust = customerItemRepository.save(customerItem);
		return ResponseEntity.ok().body(cust);
				
	}
	
	@PutMapping(("/customer/{id}"))
	ResponseEntity<CustomerItem> updateCustomer(@RequestBody CustomerItem customerItem){
		
		CustomerItem customeritem = customerItemRepository.save(customerItem);
		return ResponseEntity.ok().body(customeritem);
	}
	
	@DeleteMapping("customer/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable int id){
		customerItemRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
