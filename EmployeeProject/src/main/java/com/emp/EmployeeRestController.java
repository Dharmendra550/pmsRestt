package com.emp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController
{
@Autowired	
EmployeeRepository repo;
@GetMapping("/getdata")
public String getAllData()
{
	List<Employee> opt=repo.findAll();
	return null;
	
}
}
