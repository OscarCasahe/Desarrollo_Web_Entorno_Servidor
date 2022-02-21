package org.iesalixar.servidor.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nif",unique=true, nullable=false)
	private String nif;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="apellido1", nullable=false)
	private String apellido1;
	
	@Column(name="apellido2", nullable=false)
	private String apellido2;
	
	@Column(name="ciudad", nullable=false)
	private String ciudad;
	
	@Column(name="direccion", nullable=false)
	private String direccion;
	
	@Column(name="telefono", nullable=false)
	private String telefono;
	
	@Column(name="fecha_nacimiento", nullable=false)
	private Date fecha_nacimiento;
	
	@Column(name="sexo", nullable=false)
	private String sexo;
	
	
	//Obtenido de Relación
	@Column(name="id_departamento", nullable=false)
	private int id_departamento;

	public Profesor() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	
	
	
	
	
}
