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

import com.spring.rest.dto.Sala;
import com.spring.rest.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		
		return salaServiceImpl.listarSalas();
		
	}
	
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		
		return salaServiceImpl.guardarSala(sala);
		
	}
	
	@GetMapping("/salas/{id}")
	public Sala salaXID(@PathVariable(name = "id") Long codigo) {
		
		Sala salaXID = new Sala();
		
		salaXID = salaServiceImpl.salaXID(codigo);
		
		return salaXID;
		
	}
	
	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name = "id")Long codigo, @RequestBody Sala sala) {
		
		Sala sala_seleccionada = new Sala();
		Sala sala_actualizada = new Sala();
		
		sala_seleccionada = salaServiceImpl.salaXID(codigo);
		
		sala_seleccionada.setNombre(sala.getNombre());
		sala_seleccionada.setPeliculas(sala.getPeliculas());
		
		sala_actualizada = salaServiceImpl.actualizarSala(sala_seleccionada);
		
		return salaServiceImpl.actualizarSala(sala_actualizada);
		
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name = "id") Long codigo) {
		
		salaServiceImpl.eliminarSala(codigo);
	}
	
}
