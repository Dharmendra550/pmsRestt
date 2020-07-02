package com.client.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.client.model.ProductBean;



@Controller
public class AdminController 
{
  @Autowired
  RestTemplate restTemplate;
	@Value("${ADD_PRODUCT_URL}")
	private String addProductUrl;
	
	@Value("${UPDATE_PRODUCT_URL}")
	private String updateProductUrl;
	
	@Value("${DELETE_PRODUCT_URL}")
	private String deleteProductUrl;
	
	@Value("${FETCH_PRODUCTS_URL}")
	private String fetchProductsUrl;
	
	@Value("${FETCH_PRODUCT_URL}")
	private String fetchProductUrl;
	
	@GetMapping("/Home")
	public String getHomePage()
	{
		return "Home";
	}
	
	@GetMapping("/addProduct")
	public String getAddProductPage(Model model)
	{
	ProductBean productBean=new ProductBean();
	model.addAttribute("pbean",productBean);
	return "addProduct";
	}
	
   @PostMapping("/save")
   public String saveProduct(@ModelAttribute("pbean")ProductBean productBean)
   {
	   String str=restTemplate.postForObject(addProductUrl, productBean,String.class);
			   System.out.println(str);
	   return "Home";
   }
   
   @GetMapping("/updateProduct")
   public String getUpdateProductPage(Model model)
   {
	   ProductBean productBean=new ProductBean();
		model.addAttribute("pbean2",productBean);
		return "updateProduct";
   }
   
   @PostMapping("/update")
   public String updateProduct(@ModelAttribute("pbean2")ProductBean productBean)
   {
	   HttpEntity<ProductBean>requestEntity=new HttpEntity<ProductBean>(productBean);
	   ResponseEntity<String>re=restTemplate.exchange(updateProductUrl,HttpMethod.PUT,requestEntity,String.class);
	   System.out.println(re.getBody());
	   return "Home";
   }
   
   @GetMapping("/deleteProduct")
   public String getDeleteProductPage()
   {
	   return "deleteProduct";
   }
   @GetMapping("/delete")
   public String deleteProduct(@RequestParam Integer productid)
   {
	   ResponseEntity<String> re=restTemplate.exchange(deleteProductUrl+"?productid="+productid,HttpMethod.DELETE,null,String.class);
		System.out.println(re.getBody());
		return "Home";
   }
   
   @GetMapping("/findAllProducts")
	public   String   findProducts(Model  model) {
		
		ParameterizedTypeReference<List<ProductBean>>  typeRef = new  ParameterizedTypeReference<List<ProductBean>>() { };
		
		ResponseEntity<List<ProductBean>>   re = restTemplate.exchange(fetchProductsUrl, HttpMethod.GET, null, typeRef);
		List<ProductBean>   plist = re.getBody();
		model.addAttribute("products", plist);
		return "showProducts";
   }
   
   /*@GetMapping("/findProduct/{productid}")
   public String findProduct(Model model)
   {
		ResponseEntity<String> re=restTemplate.exchange(fetchProductUrl+"?productid=", HttpMethod.GET, null,String.class);
        System.out.println(re.getBody());
        return "fetchProduct";
   }*/



}