package com.runt.prueba.ingreso.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.ingreso.runt.entitys.Curso;
import com.runt.prueba.ingreso.runt.services.ICursoService;

@RestController
@RequestMapping (value="api")
public class CursoController {
	
	@Autowired
	private ICursoService cursoService;
	
	@GetMapping(value="cursos")
	public List<Curso> getTasks() {
		return cursoService.getCursos();
	}

}
