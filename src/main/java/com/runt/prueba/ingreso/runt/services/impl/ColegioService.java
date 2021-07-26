package com.runt.prueba.ingreso.runt.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.ingreso.runt.entitys.Colegio;
import com.runt.prueba.ingreso.runt.model.dao.IColegioDao;
import com.runt.prueba.ingreso.runt.services.IColegioService;

@Service
public class ColegioService implements IColegioService{
	
	@Autowired
	private IColegioDao cursoDao;

	@Override
	public List<Colegio> getColegios() {
		return (List<Colegio>) cursoDao.findAll();	
	}

}
