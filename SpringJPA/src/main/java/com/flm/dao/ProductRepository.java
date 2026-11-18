package com.flm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flm.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query("select p From Product p  where p.productId = :id")
	public Product getProductById(int id);
	
	@Query(nativeQuery = true , value = "select * from products where product_name = :name")
	public Product getProductByName(String name);
	
//	@Query("select p From Product p where p.productPrice = :price")
	public Product findByProductPrice(int productprice);
	
	public List<Product> findByProductPriceGreaterThan(int productprice);
	
}
