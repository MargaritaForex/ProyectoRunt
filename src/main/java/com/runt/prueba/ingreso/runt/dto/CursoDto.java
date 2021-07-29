package com.runt.prueba.ingreso.runt.dto;

import java.util.List;

import com.runt.prueba.ingreso.runt.entitys.Asignatura;

public class CursoDto {
	
	private Long idCurso;
	private String nombreCurso;
	private List<Asignatura> asignaturas;
	
	
	public Long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	
	
}
