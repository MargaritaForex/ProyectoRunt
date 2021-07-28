package com.runt.prueba.ingreso.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.ingreso.runt.entitys.AsignaturaEstudiante;
import com.runt.prueba.ingreso.runt.services.IAsignaturaEstudiante;

@RestController
@RequestMapping (value="api")
public class AsignaturaEstudianteController {

	
	@Autowired
	private IAsignaturaEstudiante asignaturaEstudianteService;
	
	@GetMapping(value="asignaturasEstudiantes")
	public List<AsignaturaEstudiante> getTasks() {
		return asignaturaEstudianteService.getAsignaturas();
	}
	
}
