package com.runt.prueba.ingreso.runt.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.runt.prueba.ingreso.runt.entitys.Curso;

public interface ICursoDao  extends CrudRepository<Curso, Long> {

}
