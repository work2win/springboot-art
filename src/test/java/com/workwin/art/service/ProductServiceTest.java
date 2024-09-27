package com.workwin.art.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.workwin.art.model.Product;
import com.workwin.art.repository.ProductRepository;


@SpringBootTest
class ProductServiceTest {
	
	@Autowired
	private ProductService productService;
	
	@MockBean
	private ProductRepository productRepository;
	
	@BeforeEach
	public void setup() {
		Optional<Product> product = Optional.of(new Product(1,"ken", 5, 500));
		Mockito.when(productRepository.findById(1)).thenReturn(product);
	}
	
	@Test
	public void testGetProductbyId() {
		String name = "ken";
		Product id = productService.getProductbyId(1);
		assertEquals(name, id.getName());
	}

	

}
