package com.curso.spring.patrones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {

	@Bean
	public Singleton singleton() {
		return Singleton.getInstance();
	}
	
	@Bean
	public Factoria factoria() {
		return new Factoria();
	}
	
	@Bean
	@Autowired
	public Renault megane(Factoria factoria) {
		return factoria.getMegane();
	}
	
	@Bean
	@Autowired
	public Renault clio(Factoria factoria) {
		return factoria.getClio();
	}
	
}
