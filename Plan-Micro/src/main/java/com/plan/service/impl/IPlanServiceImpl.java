package com.plan.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plan.dto.PlanDto;
import com.plan.entity.Plan;
import com.plan.repository.PlanRepository;
import com.plan.service.IPlanService;
@Service
public class IPlanServiceImpl implements IPlanService 
{
  @Autowired
  PlanRepository repository;
	@Override
	public List<PlanDto> getAllPlans()
	{
	List<Plan> planList=repository.findAll();
	List<PlanDto> planDtoList=new ArrayList<PlanDto>();
	  for(Plan plan:planList)
	  {
		PlanDto dto=new PlanDto();
		BeanUtils.copyProperties(plan, dto);
		planDtoList.add(dto);
	  }
		
	return planDtoList;
	}

	@Override
	public PlanDto getSpecificPlan(String planId)
	{
	Optional<Plan> opt=repository.findById(planId);
	Plan plan=opt.get();
	PlanDto dto=new PlanDto();
	BeanUtils.copyProperties(plan, dto);
	return dto;
	}

}
