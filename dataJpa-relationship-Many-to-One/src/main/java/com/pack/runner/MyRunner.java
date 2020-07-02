package com.pack.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.pack.entity.Customer;
import com.pack.entity.Order;
import com.pack.repository.OrderRepository;
@Component
public class MyRunner implements CommandLineRunner
{
@Autowired
ApplicationContext ctx;


	@Override
	public void run(String... args) throws Exception
	{
	OrderRepository orderRepo=(OrderRepository)ctx.getBean("orderRepository");	
	Customer customer=new Customer(101,7674940936L,"Dharmendra");
	
	Order order1=new Order(90911,"TV",20000.0);
	Order order2=new Order(90922,"LAPTOP",30000.0);
	Order order3=new Order(90933,"BAG",500.0);
	order1.setCustomer(customer);
	order2.setCustomer(customer);
	order3.setCustomer(customer);
	
	orderRepo.save(order1);
	orderRepo.save(order2);
	orderRepo.save(order3);
	
	/*orderRepo.deleteById(90911);*/
	

	}

}
