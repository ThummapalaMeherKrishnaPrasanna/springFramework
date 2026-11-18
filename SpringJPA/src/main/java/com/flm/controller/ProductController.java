package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.Product;
import com.flm.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/save")
	public String saveProduct() {
		
	 productService.saveProduct();
	 
	 return "Save product";
	}
	
	@GetMapping("/byid")
	public Product findProductById() {
		
		return productService.getProductById();
	}

	@GetMapping("/all")
	public List<Product> getAllProduct(){
		
		return productService.getAllProduct();

	}
	
	@GetMapping("/delete")
	public String deleteProductById() {
		
		productService.deleteProduct();
		
		return "Product deleted";
	}
	
	@GetMapping("/update")
	public Product updateProduct() {
		
		return productService.updateProduct();
	}
	
	@GetMapping("/byname")
	public Product getProductByName() {
		
		return productService.getProductByName();
	}
	
	@GetMapping("/byprice/{productprice}")
	public Product getProductByPrice(@PathVariable int productprice) {
		
		return productService.getProductByPrice(productprice);
	}
	
	@GetMapping("/bypricegreater/{productprice}")
	public List<Product> getProductByPriceGreaterThan(@PathVariable int productprice) {
		
		return productService.getProductByPriceGreaterThan(productprice);
	}
}
