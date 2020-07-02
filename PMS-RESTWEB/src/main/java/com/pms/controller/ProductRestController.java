package com.pms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.pms.dto.ProductDTO;
import com.pms.dto.ProductListDTO;
import com.pms.entity.Product;
import com.pms.repository.ProductRepository;


@Controller
public class ProductRestController 
{
@Autowired
ProductRepository repository;

@ApiOperation(value="This version 1 of end point fetches all products in JSON format")
@GetMapping(value="/v1/products",produces= {"application/JSON"},headers="API-VERSION=1")
public ResponseEntity<List<ProductListDTO>> getProductsJSON()
{
	List<Product>productsList=repository.findAll();
	List<ProductDTO>productsDtoList=new ArrayList<>();
	productsList.forEach(product->{
		
		ProductDTO pDTO=new ProductDTO();
		BeanUtils.copyProperties(product, pDTO);
		productsDtoList.add(pDTO);
	});
	ProductListDTO listDto=new ProductListDTO();
	listDto.setDtoList(productsDtoList);
	return new ResponseEntity((List<ProductListDTO>) listDto,HttpStatus.OK);
	}

@GetMapping(value="/v2/products/{productid}",produces= {"application/xml"},headers="API-VERSION=2")
public ResponseEntity<ProductDTO>getProductsXml(@PathVariable("productid")Integer productId)
{
	Optional<Product>opt=repository.findById(productId);
	Product product=opt.get();                                //ProductDTO pDTO=new ProductDTO();//if(opt.isPresent())//Product product=opt.get();//BeanUtils.copyProperties(product, pDTO);//
                                                               //return new ResponseEntity<ProductDTO>(pDTO,HttpStatus.OK); :-//To avoid whitelevel page error..get value as null.//
    ProductDTO pDTO=new ProductDTO();
	BeanUtils.copyProperties(product, pDTO);
	return new ResponseEntity<ProductDTO>(pDTO,HttpStatus.OK);
}

@PostMapping(value="/product/create",consumes= {"application/JSON","application/xml"})
public String createProduct(@RequestBody ProductDTO pDTO)
{
Product product=new Product();
BeanUtils.copyProperties(pDTO, product);
boolean flag=repository.existsById(product.getProductid());
if (flag==true)
{
	return "Sorry,The product already exist";
}
else
{
	repository.save(product);
	return "The product is added";
}
}

@PutMapping("/product/update")
public String updateProduct(@RequestBody ProductDTO pDTO)
{
	Product product=new Product();
	BeanUtils.copyProperties(pDTO, product);
	boolean flag=repository.existsById(product.getProductid());
	if (flag==true)
	{
		repository.saveAndFlush(product);
		return "The product is updated";
	}
	else
	{
		return "Sorry,The product doesn't exist";
	}
	}
@DeleteMapping("/product/delete")
public String deleteProduct(@RequestParam("productid")Integer productid)
{
	boolean flag=repository.existsById(productid);
	if(flag==true)
	{
		repository.deleteById(productid);
		return "The product is deleted";
	}
	else
	{
		return "Sorry,The product doesn't exist";
	}
}
}
