package com.runt.prueba.ingreso.runt.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.ingreso.runt.entitys.Estudiante;
import com.runt.prueba.ingreso.runt.model.dao.IEstudianteDao;
import com.runt.prueba.ingreso.runt.services.IEstudianteService;

@Service
public class EstudianteService implements IEstudianteService{
	
	@Autowired
	private IEstudianteDao estudianteDao;

	@Override
	public List<Estudiante> getEstudiantes() {
		return (List<Estudiante>) estudianteDao.findAll();		
	}
	
	

}
