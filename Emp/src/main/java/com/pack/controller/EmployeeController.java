package com.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.Employee;
import com.pack.repository.EmployeeRepository;

@RestController
public class EmployeeController
{
@Autowired
EmployeeRepository repo;

@GetMapping("/employees")
public List<Employee> getAll()
{
	return repo.findAll();
}

@GetMapping("/empbyid")
public Optional<Employee> getempbyid()
{
	return repo.findById(103);
}
}
