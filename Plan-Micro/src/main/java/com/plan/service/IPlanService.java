package com.plan.service;

import java.util.List;

import com.plan.dto.PlanDto;

public interface IPlanService 
{
List<PlanDto> getAllPlans();
PlanDto getSpecificPlan(String planId);
}
