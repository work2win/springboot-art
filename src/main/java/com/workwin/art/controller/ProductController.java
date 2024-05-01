package com.workwin.art.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workwin.art.model.Product;
import com.workwin.art.service.ProductService;

@CrossOrigin("*")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productservice.saveProduct(product);		
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return productservice.saveProducts(products);	
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return productservice.getProducts();	
	}
	
	@GetMapping("/productByid/{id}")
	public Product findProductById(@PathVariable int id) {
		return productservice.getProductbyId(id);
	}
	
	@GetMapping("/productByname/{name}")
	public Product findProductByName(@PathVariable String name) {
		return productservice.getProductbyName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productservice.updateProduct(product);		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productservice.deleteProduct(id);
	}

}
