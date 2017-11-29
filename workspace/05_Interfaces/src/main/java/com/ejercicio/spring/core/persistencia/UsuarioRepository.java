package com.ejercicio.spring.core.persistencia;

import com.ejercicio.spring.core.entidades.Usuario;

public interface UsuarioRepository {

	long salvar(Usuario usuario);
}
