package org.iesalixar.servidor.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="asignatura")
public class Asignatura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private double creditos;
	
	@Column(nullable=false)
	private String tipo;
	
	@Column(nullable=false)
	private int curso;
	
	@Column(nullable=false)
	private int cuatrimestre;
	
	
	//Obtenida de Relación
	@Column(nullable=false)
	private int id_profesor;
	
	//Obtenida de Relación
	@Column(nullable=false)
	private int id_grado;

	@OneToMany(mappedBy = "alumno_se_matricula__asignatura", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Matricula> matriculas = new HashSet<>();
	
	@OneToMany(mappedBy="asignatura", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Grado> grados = new HashSet<>();
	
	
	public Asignatura() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getCreditos() {
		return creditos;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}

	public int getId_grado() {
		return id_grado;
	}

	public void setId_grado(int id_grado) {
		this.id_grado = id_grado;
	}
	
	public Set<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(Set<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	
	
	
	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", creditos=" + creditos + ", tipo=" + tipo + ", curso="
				+ curso + ", cuatrimestre=" + cuatrimestre + ", id_profesor=" + id_profesor + ", id_grado=" + id_grado
				+ ", matriculas=" + matriculas + ", grados=" + grados + "]";
	}

	// Métodos Helpers
	public void addAsignatura(Alumno alumno, Double nota) {
		Matricula matriculacion = new Matricula(this, alumno, nota);
		this.matriculas.add(matriculacion);
		alumno.getMatriculas().add(matriculacion);
	}


	public void removeStudent(Alumno alumno) {
		Matricula matricula = new Matricula(this, alumno);
		alumno.getMatriculas().remove(matricula);
		this.matriculas.remove(matricula);
	}
	
	
}
