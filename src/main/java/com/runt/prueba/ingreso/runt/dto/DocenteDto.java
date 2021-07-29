package com.runt.prueba.ingreso.runt.dto;

import java.util.List;

public class DocenteDto {
	
	private Long idDocente;
	private String nombreDocente;
	private List<CursoDto> cursos;
	
	
	public Long getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}
	public String getNombreDocente() {
		return nombreDocente;
	}
	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}
	public List<CursoDto> getCursos() {
		return cursos;
	}
	public void setCursos(List<CursoDto> cursos) {
		this.cursos = cursos;
	}
	

}
