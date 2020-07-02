package com.customer.service;

import com.customer.dto.CustomerDto;
import com.customer.dto.LoginDto;
import com.customer.dto.RegisterDto;

public interface ICustomerService 
{
boolean registerCustomer(RegisterDto registerDto);
boolean loginCustomer(LoginDto loginDto);
CustomerDto readCustomer(Long PhoneNumber);
}
