package com.ejercicio.spring;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.negocio.ValidadorUsuario;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;
import com.ejercicio.spring.core.servicios.ServicioUsuario;

public class Aplicacion {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext 
				= new AnnotationConfigApplicationContext("com.ejercicio.spring.core.config");
		
		UsuarioRepository usuarioRepository = applicationContext.getBean(UsuarioRepository.class);
		
		Usuario usuario = new Usuario("Victor", "Herrero");
		
		/*long pk = usuarioRepository.salvar(usuario);
		
		ValidadorUsuario validadorUsuario = applicationContext.getBean(ValidadorUsuario.class);
		
		System.out.println(validadorUsuario.validar(usuario));*/
		
		ServicioUsuario servicioUsuario = applicationContext.getBean(ServicioUsuario.class);
		
		long pk = servicioUsuario.altaUsuario(usuario);
		
		Map<Long, Usuario> tablaUsuarios = applicationContext.getBean("tablaUsuarios", Map.class);
		
		System.out.println(tablaUsuarios.get(pk).getNombre());

	}

}
