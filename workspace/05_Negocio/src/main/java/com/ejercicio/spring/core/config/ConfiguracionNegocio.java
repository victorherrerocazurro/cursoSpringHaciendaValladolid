package com.ejercicio.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejercicio.spring.core.negocio.ValidadorUsuario;
import com.ejercicio.spring.core.negocio.ValidadorUsuarioBasico;

@Configuration
public class ConfiguracionNegocio {

	@Bean
	public ValidadorUsuario validadorUsuario() {
		return new ValidadorUsuarioBasico();
	}
	
}
