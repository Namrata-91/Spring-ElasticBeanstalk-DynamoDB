package com.aws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.entity.Product;
import com.aws.repository.ProductRepository;


@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/saveProduct")
	public Product savedetails(@RequestBody Product product) {
		return productRepository.addProduct(product);
	}
	
	@GetMapping("/getProduct/{productId}")
	public Product findData(@PathVariable String productId){
		return productRepository.findByID(productId);
	}
	@PutMapping("/editProduct")
    public String updateProduct(@RequestBody Product product) {
        return productRepository.EditProduct(product);
    }
	@DeleteMapping("/deleteProduct")
	public String deleteProduct(@RequestBody Product product) {
	return productRepository.deleteProduct(product);
	}
}
