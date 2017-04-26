package com.ejemplo;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class Persona {

	@NotEmpty
	private String nombre;
	@Min(18)
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Persona(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
