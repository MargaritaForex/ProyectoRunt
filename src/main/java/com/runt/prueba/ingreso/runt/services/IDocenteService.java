package com.runt.prueba.ingreso.runt.services;

import java.util.List;
import java.util.Optional;

import com.runt.prueba.ingreso.runt.entitys.Docente;

public interface IDocenteService {
	
	public List<Docente> obtenerDocentes();
	
	public Docente obtenerDocentesPorId(String id);
	
	
	

}
