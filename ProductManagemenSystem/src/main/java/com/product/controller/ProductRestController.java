package com.product.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.product.entity.Product;
import com.product.model.ProductModel;
import com.product.repository.ProductRepository;

@Controller
public class ProductRestController
{
@Autowired
ProductRepository repo;

@GetMapping("/home")
public String gethomePage()
{
	return "home";
}
@GetMapping("/addproduct")
public String getaddProduct(Model model)
{
ProductModel ep=new ProductModel();
model.addAttribute("epmodel" ,ep);
return "addproduct";
}
@PostMapping("/saveProduct")
public String saveProduct(@ModelAttribute("epmodel")ProductModel productModel, Model model)
{
	Product product=new Product();
	BeanUtils.copyProperties(productModel, product);
	boolean flag=repo.existsById(product.getProductid());
	if(flag==true)
	{
		model.addAttribute("message", "Sorry,Product already exist");
		return "home";
		
	}
	else
	{
		repo.save(product);
		model.addAttribute("message","Product added to database");
		return "home";
	}
	}
}
