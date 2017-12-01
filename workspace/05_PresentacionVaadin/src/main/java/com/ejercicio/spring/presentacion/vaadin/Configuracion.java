package com.ejercicio.spring.presentacion.vaadin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ejercicio.spring.core.config")
// @PropertySource({"classpath:db.properties","classpath:consultas.properties"})
public class Configuracion {

	/*
	 * @Bean public ValidadorUsuario validadorUsuario() { return new
	 * ValidadorUsuarioBasico(); }
	 * 
	 * @Bean public Map<Long, Usuario> tablaUsuarios(){ return new HashMap<Long,
	 * Usuario>(); }
	 * 
	 * @Bean
	 * 
	 * @Autowired public UsuarioRepository
	 * usuarioRepostory(@Qualifier("tablaUsuarios") Map<Long, Usuario>
	 * tablaUsuarios) { return new UsuarioRepositoryMemoria(tablaUsuarios); }
	 * 
	 * @Bean
	 * 
	 * @Autowired public ServicioUsuario servicioUsuario(ValidadorUsuario
	 * validadorUsuario, UsuarioRepository usuarioRepository) { return new
	 * ServicioUsuarioConValidacion(validadorUsuario, usuarioRepository); }
	 */
}
