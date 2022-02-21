package org.iesalixar.servidor.dto;

public class GradoDTO {
	
	private String id;
	private String nombre;
	private String nif;
	private String asignatura_id;
	
	public GradoDTO() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getAsignatura_id() {
		return asignatura_id;
	}
	public void setAsignatura_id(String asignatura_id) {
		this.asignatura_id = asignatura_id;
	}

	@Override
	public String toString() {
		return "GradoDTO [id=" + id + ", nombre=" + nombre + ", nif=" + nif + ", asignatura_id=" + asignatura_id + "]";
	}
	
	
	
	

	

}
