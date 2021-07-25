package com.runt.prueba.ingreso.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.ingreso.runt.entitys.Asignatura;
import com.runt.prueba.ingreso.runt.services.IAsignaturaService;

@RestController
@RequestMapping (value="api")
public class AsignaturaController {
	
	@Autowired
	private IAsignaturaService asignaturaService;
	
	@GetMapping(value="asignatura")
	public List<Asignatura> getTasks() {
		return asignaturaService.getAsignaturas();
	}

}
