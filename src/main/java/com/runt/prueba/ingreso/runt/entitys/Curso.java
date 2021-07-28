package com.runt.prueba.ingreso.runt.entitys;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String grado;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
     @JoinColumn(name = "id_colegio", nullable = false)
     private Colegio colegio;
	 
	 @OneToMany(mappedBy = "curso")
	 Set<AsignaturaEstudiante> salon;
	 
	 @OneToMany(mappedBy = "curso")
	 Set<Asignatura> asignaturas;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
     @JoinColumn(name = "id_docente", nullable = false)
     Docente docente;
	
	public Long getId() { 
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGrado() {
		return grado;
	}
	
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public Set<AsignaturaEstudiante> getSalon() {
		return salon;
	}
	public void setSalon(Set<AsignaturaEstudiante> salon) {
		this.salon = salon;
	}


}
