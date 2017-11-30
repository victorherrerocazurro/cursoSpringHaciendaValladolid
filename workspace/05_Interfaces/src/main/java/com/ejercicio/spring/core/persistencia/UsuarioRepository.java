package com.ejercicio.spring.core.persistencia;

import java.util.Collection;

import com.ejercicio.spring.core.entidades.Usuario;

public interface UsuarioRepository {

	long salvar(Usuario usuario);

	Collection<Usuario> consultarTodos();
}
