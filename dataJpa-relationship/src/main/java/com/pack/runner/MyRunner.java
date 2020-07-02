package com.pack.runner;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.pack.entity.Customer;
import com.pack.entity.Order;
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
/*Customer customer=new Customer(101,"Dharmendra",7674940936L);
Order order1=new Order(91911,"TV",5000.0);
Order order2=new Order(91922,"LAPTOP",25000.0);
Order order3=new Order(91933,"BAG",500.0);
Set<Order> orders=new HashSet<Order>();
orders.add(order1);
orders.add(order2);
orders.add(order3);
customer.setOrders(orders);

custRepo.save(customer);*/

/*Optional<Customer>opt=custRepo.findById(101);
Customer cust=opt.get();*/


 /*custRepo.deleteById(101);*/
   
	}

}
