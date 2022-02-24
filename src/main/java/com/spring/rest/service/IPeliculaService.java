package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPeliculas();
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula peliculaXID(Long codigo);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(Long codigo);
	
}
