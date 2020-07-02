package com.pack.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.pack.document.Customer;
import com.pack.repository.CustomerRepository;
@Component
public class MyRunner implements CommandLineRunner 
{
@Autowired
ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception 
	{
	CustomerRepository custRepo=(CustomerRepository)ctx.getBean("customerRepository");
	
	/*Customer customer1=new Customer();
	customer1.setCustomerId(12011);
	customer1.setCustomerName("Dharmendra");
	customer1.setCity("Hyderabad");
	custRepo.save(customer1);*/
	
	
	/*Optional<Customer>opt=custRepo.findById(12011);
	Customer customer=opt.get();
	System.out.println(customer.getCustomerName());
	System.out.println(customer.getCity());*/
	
	
    List<Customer> list=custRepo.findAll();
	list.forEach(f1->System.out.println(f1));
	
	}

}
