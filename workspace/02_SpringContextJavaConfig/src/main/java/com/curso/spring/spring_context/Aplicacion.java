package com.curso.spring.spring_context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = 
							new AnnotationConfigApplicationContext(Configuracion.class);
		
		Jefe jefe = applicationContext.getBean(Jefe.class);
		
		jefe.realizarProyecto();
		
		Trabajador trabajador = applicationContext.getBean(Trabajador.class);
		
		System.out.println(trabajador);
		
		String string = applicationContext.getBean("cadena1", String.class);
		
		
		
	}
}
