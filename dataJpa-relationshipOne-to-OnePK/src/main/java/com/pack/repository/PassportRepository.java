package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> 
{

}
