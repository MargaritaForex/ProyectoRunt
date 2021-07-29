package com.runt.prueba.ingreso.runt.dto;

import java.util.List;

public class AsignaturaDto {
	
	private int idAsignatura;
	private String nombreAsignatura;
	private List<EstudianteDto> estudiantes;

	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public List<EstudianteDto> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(List<EstudianteDto> estudiantes) {
		this.estudiantes = estudiantes;
	}

	
	
}
