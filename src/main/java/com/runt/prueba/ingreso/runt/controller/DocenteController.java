package com.runt.prueba.ingreso.runt.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.ingreso.runt.entitys.Docente;
import com.runt.prueba.ingreso.runt.services.IDocenteService;

@RestController
@RequestMapping (value="api")
public class DocenteController {
	
	@Autowired
	private IDocenteService docenteService;	

	@GetMapping(value="docentes")
	public List<Docente> obtenerDocentes() {
		return docenteService.obtenerDocentes();
	}
	
	@GetMapping(value="docentesPorId/{id}")
	public Optional<Docente> obtenerDocentesPorId(@PathVariable("id") String id) {
		return docenteService.obtenerDocentesPorId(id);
	}
	
}
