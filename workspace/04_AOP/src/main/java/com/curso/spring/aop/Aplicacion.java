package com.curso.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext 
							= new AnnotationConfigApplicationContext(Configuracion.class);
		
		Servicio servicio = applicationContext.getBean(Servicio.class);
		
		servicio.metodo();
		
		servicio.otro();

	}

}
