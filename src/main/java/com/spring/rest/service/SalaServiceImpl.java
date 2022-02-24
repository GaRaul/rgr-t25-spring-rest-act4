package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.ISalaDao;
import com.spring.rest.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDao iSalaDao; 
	
	@Override
	public List<Sala> listarSalas() {
		// TODO Auto-generated method stub
		return iSalaDao.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaDao.save(sala);
	}

	@Override
	public Sala salaXID(Long codigo) {
		// TODO Auto-generated method stub
		return iSalaDao.findById(codigo).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		
		return iSalaDao.save(sala);
	}

	@Override
	public void eliminarSala(Long codigo) {
		// TODO Auto-generated method stub
		iSalaDao.deleteById(codigo);
	}


}
