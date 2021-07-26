package com.runt.prueba.ingreso.runt.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.ingreso.runt.entitys.Curso;
import com.runt.prueba.ingreso.runt.model.dao.ICursoDao;
import com.runt.prueba.ingreso.runt.services.ICursoService;

@Service
public class CursoService  implements ICursoService{
	
	@Autowired
	private ICursoDao cursoDao;

	@Override
	public List<Curso> getCursos() {
		return (List<Curso>) cursoDao.findAll();	
	}

	
	

}
