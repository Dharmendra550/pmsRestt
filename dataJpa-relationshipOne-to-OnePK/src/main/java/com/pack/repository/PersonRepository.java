package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
