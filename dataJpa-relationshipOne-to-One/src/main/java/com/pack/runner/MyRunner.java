package com.pack.runner;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.pack.entity.Passport;
import com.pack.entity.Person;
import com.pack.repository.PassportRepository;
@Component
public class MyRunner implements CommandLineRunner 
{
@Autowired
ApplicationContext ctx;
	@Override
	public void run(String... args) throws Exception 
	{
	PassportRepository passRepo=(PassportRepository)ctx.getBean("passportRepository");
	
	
	Person person=new Person();
	person.setPersonid(10101);
	person.setPersonname("Dharmendra");
	
	
	Passport passport=new Passport();
	passport.setPassportid(9911202);
	try
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date expDate=sdf.parse("31-12-2025");
		passport.setPassportexpiredate(expDate);
	}
	catch(Exception e)
	{}
	passport.setPerson(person);
	passRepo.save(passport);
	}

}
