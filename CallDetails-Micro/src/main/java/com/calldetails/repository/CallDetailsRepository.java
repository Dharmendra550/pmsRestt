package com.calldetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calldetails.entity.CallDetails;

public interface CallDetailsRepository extends JpaRepository <CallDetails,Long> 
{
List<CallDetails>findByCalledBy(Long CalledBy);
}
