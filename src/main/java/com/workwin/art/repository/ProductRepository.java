package com.workwin.art.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workwin.art.model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);

	Product findByQuantity(int quantity);

	Product findById(Product orElse);
	
	Product findByPrice(double price);

}