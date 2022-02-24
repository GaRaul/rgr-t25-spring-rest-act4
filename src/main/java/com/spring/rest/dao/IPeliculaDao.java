package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Pelicula;

public interface IPeliculaDao extends JpaRepository<Pelicula, Long>{

}
