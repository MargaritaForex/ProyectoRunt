package com.runt.prueba.ingreso.runt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.ingreso.runt.entitys.Colegio;
import com.runt.prueba.ingreso.runt.services.IColegioService;
@RestController
@RequestMapping (value="api")
public class ColegioController {
	
	@Autowired
	private IColegioService colegioService;
	
	@GetMapping(value="colegios")
	public List<Colegio> getTasks() {
		return colegioService.getColegios();
	}

}
