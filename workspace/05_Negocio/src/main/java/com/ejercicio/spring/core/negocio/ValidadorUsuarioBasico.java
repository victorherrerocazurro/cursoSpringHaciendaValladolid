package com.ejercicio.spring.core.negocio;

import com.ejercicio.spring.core.entidades.Usuario;

public class ValidadorUsuarioBasico implements ValidadorUsuario{

	public boolean validar(Usuario usuario) {
		return usuario.getNombre() != null && !usuario.getNombre().equals("");
	}

}
