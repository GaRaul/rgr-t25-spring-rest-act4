package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Sala;

public interface ISalaDao extends JpaRepository<Sala, Long>{
	
}
