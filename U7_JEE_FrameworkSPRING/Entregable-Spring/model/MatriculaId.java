package org.iesalixar.servidor.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

public class MatriculaId {

	private Long asignatura;
	private Long alumno;
	
	public MatriculaId() {
		super();
	}

	public Long getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Long asignatura) {
		this.asignatura = asignatura;
	}

	public Long getAlumno() {
		return alumno;
	}

	public void setAlumno(Long alumno) {
		this.alumno = alumno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alumno, asignatura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatriculaId other = (MatriculaId) obj;
		return Objects.equals(alumno, other.alumno) && Objects.equals(asignatura, other.asignatura);
	}
	
	
	
	
}
