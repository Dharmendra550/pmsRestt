package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.dto.CustomerDto;
import com.customer.dto.LoginDto;
import com.customer.dto.PlanDto;
import com.customer.dto.RegisterDto;
import com.customer.service.ICustomerService;

@RestController
public class CustomerRestController 
{
@Autowired
ICustomerService service;
@Autowired
RestTemplate restTemplate;

private static String PLAN_URL="http://localhost:5566/Plan/{planId}";
private static String FRIEND_URL="http://localhost:5555/Friend/{phoneNumber}";

@PostMapping("/register")
public boolean addCustomer(@RequestBody RegisterDto registerDto)
{
	return service.registerCustomer(registerDto);
}

@PostMapping("/login")
public boolean loginCustomer(@RequestBody LoginDto loginDto)
{
	return service.loginCustomer(loginDto);
}

@GetMapping("/viewProfile/{phoneNumber}")
public CustomerDto customerProfile(@PathVariable Long phoneNumber)
{
	CustomerDto customerDto=service.readCustomer(phoneNumber);
	PlanDto currentplan=restTemplate.getForObject(PLAN_URL,PlanDto.class,customerDto.getPlanId());
	customerDto.setCurrentplan(currentplan);
	ParameterizedTypeReference<List<Long>> typeRef=new ParameterizedTypeReference<List<Long>>() {};
	ResponseEntity<List<Long>> re=restTemplate.exchange(FRIEND_URL,HttpMethod.GET,null,typeRef,phoneNumber);
	List<Long>friendsContactNumbers=re.getBody();
	customerDto.setFriendsContactNumbers(friendsContactNumbers);
	return customerDto;
	
}
}
