package com.ejercicio.spring.core.entidades;

public class Usuario {
	private long id;
	private String nombre;
	private String apellido;
	
	//Mantengo porque emplearemos JPA mas adelante
	public Usuario() {
		super();
	}
	
	//Por comodidad a la ghora de instanciar
	public Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}	
}
