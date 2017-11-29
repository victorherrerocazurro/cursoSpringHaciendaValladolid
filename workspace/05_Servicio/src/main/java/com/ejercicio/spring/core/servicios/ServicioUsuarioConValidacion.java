package com.ejercicio.spring.core.servicios;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.negocio.ValidadorUsuario;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;

public class ServicioUsuarioConValidacion implements ServicioUsuario{

	private ValidadorUsuario validadorUsuario;
	private UsuarioRepository usuarioRepository;
	
	public ServicioUsuarioConValidacion(ValidadorUsuario validadorUsuario, UsuarioRepository usuarioRepository) {
		super();
		this.validadorUsuario = validadorUsuario;
		this.usuarioRepository = usuarioRepository;
	}

	public long altaUsuario(Usuario usuario) {
		
		if(validadorUsuario.validar(usuario)) {
			return usuarioRepository.salvar(usuario);
		} else {
			throw new RuntimeException("El usuario no es valido");
		}
	}

}
