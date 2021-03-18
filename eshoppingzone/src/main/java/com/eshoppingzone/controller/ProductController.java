package com.eshoppingzone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshoppingzone.models.Product;
import com.eshoppingzone.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/postp")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
		
	}
	
	@GetMapping("/getp")
	public List<Product> getProduct(){
		return productRepository.findAll();
	}
}
