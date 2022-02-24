package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.Pelicula;
import com.spring.rest.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula peliculaXID(@PathVariable(name = "id") Long codigo) {
		
		return peliculaServiceImpl.peliculaXID(codigo);
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") Long codigo, @RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionada = new Pelicula();
		Pelicula pelicula_actualizada = new Pelicula();
		
		pelicula_seleccionada = peliculaServiceImpl.peliculaXID(codigo);
		
		pelicula_seleccionada.setNombre(pelicula.getNombre());
		pelicula_seleccionada.setCalificacion_edad(pelicula.getCalificacion_edad());
		
		pelicula_actualizada = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionada);
		
		return pelicula_actualizada;
		
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name="id") Long codigo) {
		peliculaServiceImpl.eliminarPelicula(codigo);
	}
	
}
