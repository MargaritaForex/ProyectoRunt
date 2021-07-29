package com.runt.prueba.ingreso.runt.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.runt.prueba.ingreso.runt.dto.AsignaturaDto;
import com.runt.prueba.ingreso.runt.dto.CursoDto;
import com.runt.prueba.ingreso.runt.dto.DocenteDto;
import com.runt.prueba.ingreso.runt.entitys.AsignaturaEstudiante;
import com.runt.prueba.ingreso.runt.entitys.Curso;
import com.runt.prueba.ingreso.runt.entitys.Docente;
import com.runt.prueba.ingreso.runt.mapper.IMapperDocente;

@Component
public class MapperDocente implements IMapperDocente{

	@Override
	public DocenteDto getDocentePorId(Docente docente) {
		DocenteDto docenteResponse = new DocenteDto();
		
		List<CursoDto> cursos = new ArrayList();
		CursoDto cursoDto = new CursoDto();
		
		List<AsignaturaDto> asignaturas = new ArrayList();
		AsignaturaDto asignatura = new AsignaturaDto();
		
		docenteResponse.setIdDocente(docente.getId());
		docenteResponse.setNombreDocente(docente.getNombre());
		
		for (Curso curso : docente.getCursos()) {
			
			cursoDto.setIdCurso(curso.getId());
			cursoDto.setNombreCurso(curso.getGrado());
			cursos.add(cursoDto);
			curso.getGrado();		
			
			if(curso.getSalon().size()>0) {
				
				for (AsignaturaEstudiante asignaturaEstudiante : curso.getSalon()) {
					asignaturaEstudiante.getEstudiante();
				}
				
			}
		}
		docenteResponse.setCursos(cursos);
	
		return docenteResponse;
	}

}
