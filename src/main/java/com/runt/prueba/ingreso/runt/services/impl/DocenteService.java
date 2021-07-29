package com.runt.prueba.ingreso.runt.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.ingreso.runt.entitys.Docente;
import com.runt.prueba.ingreso.runt.model.dao.IDocenteDao;
import com.runt.prueba.ingreso.runt.services.IDocenteService;

@Service
public class DocenteService implements IDocenteService{

	@Autowired
	private IDocenteDao docenteDao;

	@Override
	public List<Docente> obtenerDocentes() {
		return (List<Docente>) docenteDao.findAll();	
	}

	@Override
	public Docente obtenerDocentesPorId(String id) {		
		return docenteDao.findById(Long.parseLong(id)).get();
	}

}
