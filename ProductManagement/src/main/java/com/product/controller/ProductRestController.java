package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@RestController
public class ProductRestController 
{
@Autowired
ProductRepository repo;


@GetMapping("/products")
public List<Product> getAll()
{
	return repo.findAll();
}

@GetMapping("/product/{productbyid}")
public Optional<Product> getproductbyid()
{
	return repo.findById(9021);
	
}
}
