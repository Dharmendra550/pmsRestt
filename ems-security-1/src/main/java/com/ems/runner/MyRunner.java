package com.ems.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
@Component
public class MyRunner implements CommandLineRunner 
{
@Autowired
JdbcTemplate jdbcTemplate;

@Autowired
BCryptPasswordEncoder encoder;
	@Override
	public void run(String... args) throws Exception 
	{
	/*String pwd1=encoder.encode("tech123");
	String pwd2=encoder.encode("sun@123");
	String pwd3=encoder.encode("boot#111");*/
	
	/*jdbcTemplate.update("insert into users values(?,?,?)","situ",pwd1,0);
	jdbcTemplate.update("insert into users values(?,?,?)","allen",pwd2,1);
	jdbcTemplate.update("insert into users values(?,?,?)","ravi",pwd3,1);*/


	
	/*jdbcTemplate.update("insert into authorities values(?,?)","situ","ROLE_ADMIN");
	jdbcTemplate.update("insert into authorities values(?,?)","allen","ROLE_ACCOUNTANT");
	jdbcTemplate.update("insert into authorities values(?,?)","ravi","ROLE_ACCOUNTANT");*/
	}

}
