package com.crm.Dao;

import org.springframework.stereotype.Repository;

import com.crm.Model.CustomerBean;

@Repository
public interface CustomerDao 
{
	boolean addCustomer(CustomerBean customerBean);
	boolean loginCustomer(String email,String password);
}
