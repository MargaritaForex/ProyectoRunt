package com.runt.prueba.ingreso.runt.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.ingreso.runt.entitys.Asignatura;
import com.runt.prueba.ingreso.runt.model.dao.IAsignauraDao;
import com.runt.prueba.ingreso.runt.services.IAsignaturaService;
@Service
public class AsignaturaService implements IAsignaturaService{
	
	@Autowired
	private IAsignauraDao asignaturaDao;
	

	@Override
	public List<Asignatura> getAsignaturas() {
		return (List<Asignatura>) asignaturaDao.findAll();	
	}

}
