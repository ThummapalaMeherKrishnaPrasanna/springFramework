package com.flm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.dao.ProductRepository;
import com.flm.model.Product;

@Component
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public void saveProduct() {
		
		Product product = new Product("Fan" , 3000);
		
		productRepository.save(product);
	}
	
	
	
	public List<Product> getAllProduct(){
		
		List<Product> list = productRepository.findAll();
		
		return list;
	}
	
	public void deleteProduct() {
		
		Product product = new Product(1 , null, 0);
		
		productRepository.delete(product);
	}
	
	public Product updateProduct() {
		
		Optional<Product> optionalProduct = productRepository.findById(1);
		
		Product product = optionalProduct.get();
		
		product.setProductPrice(5000);
		
		productRepository.save(product);
	
		return product;
		
	}
	public Product getProductById() {
		
//		Optional<Product> optionalProduct = productRepository.findById(1);
//		
//		Product product = optionalProduct.get();
		
		Product product = productRepository.getProductById(1);
		
		return product;
	}
	public Product getProductByName() {
		
		Product product = productRepository.getProductByName("Fan");
		System.out.println(product.getProductName());
		
		return product;
	}
	
	public Product getProductByPrice(int productprice) {
		
		return productRepository.findByProductPrice(productprice);
	}
	
	public List<Product> getProductByPriceGreaterThan(int productprice){
		
		return productRepository.findByProductPriceGreaterThan(productprice);
	}
}
