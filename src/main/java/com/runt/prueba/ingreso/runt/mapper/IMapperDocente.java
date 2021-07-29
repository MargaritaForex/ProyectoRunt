package com.runt.prueba.ingreso.runt.mapper;


import com.runt.prueba.ingreso.runt.dto.DocenteDto;
import com.runt.prueba.ingreso.runt.entitys.Docente;

public interface IMapperDocente {
	
	public DocenteDto getDocentePorId(Docente docente);

}
