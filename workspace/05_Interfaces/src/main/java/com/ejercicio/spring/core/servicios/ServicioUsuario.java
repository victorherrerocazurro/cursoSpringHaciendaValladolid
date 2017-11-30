package com.ejercicio.spring.core.servicios;

import java.util.Collection;

import com.ejercicio.spring.core.entidades.Usuario;

public interface ServicioUsuario {

	long altaUsuario(Usuario usuario);

	Collection<Usuario> busquedaUsuarios();
}
