package com.workwin.art.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.workwin.art.model.Product;
import com.workwin.art.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product){
		
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products){
		repository.saveAll(products);
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Page<Product> getAllProducts(int pageNumber, int pageSize){
		
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		return repository.findAll(pageable);
	}
	
	public Product getProductbyId(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductbyName(String name) {
		return repository.findByName(name);
	}
	
	public Product getProductbyPrice(double price) {
		return repository.findByPrice(price);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product removed || "+id;
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct = repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
	}
	
	
	
}
