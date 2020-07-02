package com.calldetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.calldetails.dto.CallDetailsDto;
import com.calldetails.entity.CallDetails;
import com.calldetails.repository.CallDetailsRepository;
import com.calldetails.service.ICallDetailsService;
@Service
public class CallDetailsServiceImpl implements ICallDetailsService 
{
 @Autowired
 CallDetailsRepository repository;
	@Override
	public List<CallDetailsDto> readCallDetails(Long PhoneNumber) {
		List<CallDetails> callDetailsList=repository.findByCalledBy(PhoneNumber);
		List<CallDetailsDto>callDetailsDto=new ArrayList<>();
		callDetailsList.forEach(callDetails->{
			CallDetailsDto dto=new CallDetailsDto();
			BeanUtils.copyProperties(callDetails, dto);
			callDetailsDto.add(dto);
		});
				return callDetailsDto;
	}

}
