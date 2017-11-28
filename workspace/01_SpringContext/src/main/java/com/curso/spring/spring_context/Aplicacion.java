package com.curso.spring.spring_context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Jefe jefe = applicationContext.getBean(Jefe.class);
		
		jefe.realizarProyecto();
		
		Trabajador trabajador = applicationContext.getBean(Trabajador.class);
		
		System.out.println(trabajador);
		
		String string = applicationContext.getBean("cadena1", String.class);
		
		
		
	}
}
