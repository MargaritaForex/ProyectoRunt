package com.runt.prueba.ingreso.runt.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.runt.prueba.ingreso.runt.entitys.Estudiante;

public interface IEstudianteDao extends CrudRepository<Estudiante, Long> {

}
