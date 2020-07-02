package com.customer.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dto.CustomerDto;
import com.customer.dto.LoginDto;
import com.customer.dto.RegisterDto;
import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService 
{
@Autowired
CustomerRepository repository;
	@Override
	public boolean registerCustomer(RegisterDto registerDto) 
	{
	if(repository.existsById(registerDto.getPhoneNumber())==false)
{
	Customer customer=new Customer();
	BeanUtils.copyProperties(registerDto, customer);
	repository.save(customer);
	return true;
}    
	else
	{
		return false;
		
	}
}

	@Override
	public boolean loginCustomer(LoginDto loginDto)
	{
	if(repository.checkLogin(loginDto.getPhoneNumber(),loginDto.getPassword())==1)
	{
		return true;
	}
	else
	{
		return false;
	}
	}

	@Override
	public CustomerDto readCustomer(Long PhoneNumber) 
	{
	Customer customer=repository.findById(PhoneNumber).get();
	CustomerDto customerDto=new CustomerDto();
	BeanUtils.copyProperties(customer, customerDto);
	return customerDto;
	}

}
