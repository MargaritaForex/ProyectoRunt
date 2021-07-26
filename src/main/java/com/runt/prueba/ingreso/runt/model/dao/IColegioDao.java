package com.runt.prueba.ingreso.runt.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.runt.prueba.ingreso.runt.entitys.Colegio;

public interface IColegioDao extends CrudRepository<Colegio, Long> {

}
