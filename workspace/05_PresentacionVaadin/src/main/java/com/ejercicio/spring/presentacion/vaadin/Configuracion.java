package com.ejercicio.spring.presentacion.vaadin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.negocio.ValidadorUsuario;
import com.ejercicio.spring.core.negocio.ValidadorUsuarioBasico;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;
import com.ejercicio.spring.core.persistencia.memoria.UsuarioRepositoryMemoria;
import com.ejercicio.spring.core.servicios.ServicioUsuario;
import com.ejercicio.spring.core.servicios.ServicioUsuarioConValidacion;

@Configuration
//@ComponentScan("com.ejercicio.spring.core.config")
public class Configuracion {
	
	@Bean
	public ValidadorUsuario validadorUsuario() {
		return new ValidadorUsuarioBasico();
	}
	
	@Bean
	public Map<Long, Usuario> tablaUsuarios(){
		return new HashMap<Long, Usuario>();
	}
	
	@Bean
	@Autowired
	public UsuarioRepository usuarioRepostory(@Qualifier("tablaUsuarios") Map<Long, Usuario> tablaUsuarios) {
		return new UsuarioRepositoryMemoria(tablaUsuarios);
	}
	
	@Bean
	@Autowired
	public ServicioUsuario servicioUsuario(ValidadorUsuario validadorUsuario, 
												UsuarioRepository usuarioRepository) {
		return new ServicioUsuarioConValidacion(validadorUsuario, usuarioRepository);
	}
}
