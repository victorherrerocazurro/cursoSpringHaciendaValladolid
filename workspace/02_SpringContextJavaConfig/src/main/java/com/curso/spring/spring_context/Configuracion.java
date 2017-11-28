package com.curso.spring.spring_context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:trabajador.xml")
public class Configuracion {

	@Bean
	public String cadena1() {
		return new String();
	}
	
	@Bean
	@Scope("prototype")
	public String cadena2() {
		return new String();
	}
	
	@Bean
	@Scope("prototype")
	@Autowired
	public Jefe jefe(Trabajador trabajador) {
		//Jefe jefe = new Jefe(trabajador);
		Jefe jefe = new Jefe();
		jefe.setTrabajador(trabajador());
		//jefe.setTrabajador(trabajador());
		return jefe;
	}
	
	@Bean
	public Trabajador trabajador() {
		return new TrabajadorManual();
	}
}
