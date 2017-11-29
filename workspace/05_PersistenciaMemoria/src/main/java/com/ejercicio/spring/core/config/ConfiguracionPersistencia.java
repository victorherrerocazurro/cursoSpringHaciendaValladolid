package com.ejercicio.spring.core.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;
import com.ejercicio.spring.core.persistencia.memoria.UsuarioRepositoryMemoria;

@Configuration
public class ConfiguracionPersistencia {

	@Bean
	public Map<Long, Usuario> tablaUsuarios(){
		return new HashMap<Long, Usuario>();
	}
	
	@Bean
	@Autowired
	public UsuarioRepository usuarioRepostory(@Qualifier("tablaUsuarios") Map<Long, Usuario> tablaUsuarios) {
		return new UsuarioRepositoryMemoria(tablaUsuarios);
	}
	
}
