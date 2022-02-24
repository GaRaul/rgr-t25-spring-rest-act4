package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSalas();
	
	public Sala guardarSala(Sala sala);
	
	public Sala salaXID(Long codigo);
	
	public Sala actualizarSala(Sala sala);
	
	public void eliminarSala(Long codigo);
	
}
