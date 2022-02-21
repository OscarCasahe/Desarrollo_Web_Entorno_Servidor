package org.iesalixar.servidor.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(MatriculaId.class)
public class Matricula implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name="asignatura_id",insertable = false, updatable = false)
	private Asignatura asignatura;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="alumno_id",insertable = false, updatable = false)
	private Alumno student;
	
	private double nota;

	public Matricula() {
		super();
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}
	
	

	public Matricula(Asignatura asignatura, Alumno student) {
		super();
		this.asignatura = asignatura;
		this.student = student;
	}
	
	

	public Matricula(Asignatura asignatura, Alumno student, double nota) {
		super();
		this.asignatura = asignatura;
		this.student = student;
		this.nota = nota;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Alumno getStudent() {
		return student;
	}

	public void setStudent(Alumno student) {
		this.student = student;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignatura, nota, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return Objects.equals(asignatura, other.asignatura)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota)
				&& Objects.equals(student, other.student);
	}

	@Override
	public String toString() {
		return "Matricula [asignatura=" + asignatura + ", student=" + student + ", nota=" + nota + "]";
	}
	
	
	
	
	
	
}
