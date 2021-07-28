package com.runt.prueba.ingreso.runt.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.ingreso.runt.model.dao.IAsignaturaEstudianteDao;
import com.runt.prueba.ingreso.runt.services.IAsignaturaEstudiante;

@Service
public class AsignaturaEstudiante  implements IAsignaturaEstudiante{

	

	@Autowired
	private IAsignaturaEstudianteDao asignaturaEstudianteDao;
	
	
	@Override
	public List<com.runt.prueba.ingreso.runt.entitys.AsignaturaEstudiante> getAsignaturas() {
		return (List<com.runt.prueba.ingreso.runt.entitys.AsignaturaEstudiante>) asignaturaEstudianteDao.findAll();
	}

}
