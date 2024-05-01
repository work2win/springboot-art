package com.workwin.art.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workwin.art.model.CustomerItem;


@Repository
public interface CustomerItemRepository extends JpaRepository<CustomerItem, Integer>{

	
	
	CustomerItem findByName(String name);

	//CustomerItem findByQuantity(int id);

	CustomerItem findById(CustomerItem orElse);
	
	
}
