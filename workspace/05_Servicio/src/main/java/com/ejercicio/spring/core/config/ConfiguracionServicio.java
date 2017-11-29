package com.ejercicio.spring.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejercicio.spring.core.negocio.ValidadorUsuario;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;
import com.ejercicio.spring.core.servicios.ServicioUsuario;
import com.ejercicio.spring.core.servicios.ServicioUsuarioConValidacion;

@Configuration
public class ConfiguracionServicio {

	@Bean
	@Autowired
	public ServicioUsuario servicioUsuario(ValidadorUsuario validadorUsuario, 
												UsuarioRepository usuarioRepository) {
		return new ServicioUsuarioConValidacion(validadorUsuario, usuarioRepository);
	}
	
}
