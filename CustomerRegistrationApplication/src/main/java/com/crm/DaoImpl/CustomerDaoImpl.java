package com.crm.DaoImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.crm.Dao.CustomerDao;
import com.crm.Model.CustomerBean;

public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	  JdbcTemplate jdbcTemplate;
		@Override
		public boolean addCustomer(CustomerBean customerBean)
		{
			int count=jdbcTemplate.queryForObject("select count(*)from customer where email=?",Integer.class,customerBean.getEmail());
			if(count==1)
			{
			return false;
		    }
			else
		{
			jdbcTemplate.update("insert into customer(firstName,lastName,email,password,gender,country) values=(?,?,?,?,?,?)",customerBean.getFirstName(),customerBean.getLastName(),customerBean.getEmail(),customerBean.getPassword(),customerBean.getGender(),customerBean.getCountry());
			return true;
		}
		}

		@Override
		public boolean loginCustomer(String email, String password) 
		{
		int count=jdbcTemplate.queryForObject("select count(*)from customer where customer email=? and password=?",Integer.class, email ,password);
		if(count==1)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		}
}
