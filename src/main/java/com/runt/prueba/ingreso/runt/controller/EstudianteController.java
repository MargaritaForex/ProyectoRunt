package com.runt.prueba.ingreso.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.ingreso.runt.entitys.Estudiante;
import com.runt.prueba.ingreso.runt.services.IEstudianteService;


@RestController
@RequestMapping (value="api")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping(value="estudiante")
	public List<Estudiante> getTasks() {
		return estudianteService.getEstudiantes();
	}

}
