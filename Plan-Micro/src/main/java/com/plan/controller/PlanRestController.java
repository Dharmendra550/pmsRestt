package com.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.plan.dto.PlanDto;
import com.plan.service.IPlanService;

@RestController
public class PlanRestController 
{
@Autowired
IPlanService service;
@GetMapping("/browsePlans")
public List<PlanDto>getPlans()
{
	return service.getAllPlans();
}
@GetMapping("/{planId}")
public PlanDto getSpecificPlan(@PathVariable String planId)
{
	return service.getSpecificPlan(planId);
}
}
