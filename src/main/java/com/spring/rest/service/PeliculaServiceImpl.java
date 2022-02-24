package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IPeliculaDao;
import com.spring.rest.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaDao iPeliculaDao;

	@Override
	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculaDao.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDao.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Long codigo) {
		// TODO Auto-generated method stub
		return iPeliculaDao.findById(codigo).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDao.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long codigo) {
		// TODO Auto-generated method stub
		iPeliculaDao.deleteById(codigo);
	}

}
