package com.runt.prueba.ingreso.runt.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.runt.prueba.ingreso.runt.entitys.Docente;

public interface IDocenteDao   extends CrudRepository<Docente, Long> {

}
