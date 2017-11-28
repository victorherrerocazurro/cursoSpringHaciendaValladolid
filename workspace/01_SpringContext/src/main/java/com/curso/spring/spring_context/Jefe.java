package com.curso.spring.spring_context;

public class Jefe {

	//Dependencia
	private Trabajador trabajador;

	//Inyeccion de Dependencia Setter
	public void setTrabajador(Trabajador trabajador) {
		System.out.println("Estamos estableciendo el trabajador: " + trabajador);
		this.trabajador = trabajador;
	}
	
	public Jefe() {
		super();
		System.out.println("Estamos construyendo el Jefe sin parametros");
	}

	//Inyeccion de Dependencia Ctor
	public Jefe(Trabajador trabajador) {
		super();
		System.out.println("Estamos construyendo el Jefe con parametros: " + trabajador);
		this.trabajador = trabajador;
	}
	
	public void realizarProyecto() {
		//La necesidad de cubrir la dependencia
		System.out.println("Estamos en el jefe realizando el proyecto");
		trabajador.trabaja();
	}	
}
