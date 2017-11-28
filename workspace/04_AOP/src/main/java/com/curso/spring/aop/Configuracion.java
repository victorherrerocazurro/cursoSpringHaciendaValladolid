package com.curso.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//Activar la interpretacion de anotaciones de @Aspect, @Before, @After, @Around, @After, ...
@EnableAspectJAutoProxy
//Activa la busqueda de clases anotadas con @Component, @Repository, @Contoller, ... dentro del
//paquete o algun subpaquete indicado
@ComponentScan("com.curso.spring.aop")
public class Configuracion {

	@Bean
	public Dao dao() {
		return new Dao();
	}
	
}
