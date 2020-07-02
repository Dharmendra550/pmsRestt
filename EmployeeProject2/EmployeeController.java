package com.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("/employee")
	public String getEmployeeData()
	{
		List<Employee> opt=repo.findAll();
		
		return null;
	}
}
