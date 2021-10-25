package iesalixar.server.controller.model;

import java.io.Serializable;

public class Reserva implements Serializable{
	private String fechaInicio;
	private String fechaFin;
	private int personas;
	
	
	public Reserva(String fechaInicio, String fechaFin, int personas) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.personas = personas;
	}
	
	
}
