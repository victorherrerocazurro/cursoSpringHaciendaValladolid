package com.ejercicio.spring.core.persistencia.memoria;

import java.util.Map;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;

public class UsuarioRepositoryMemoria implements UsuarioRepository{

	private Map<Long, Usuario> tablaUsuarios;
	
	private long id = 0;
	
	public UsuarioRepositoryMemoria(Map<Long, Usuario> tablaUsuarios) {
		super();
		this.tablaUsuarios = tablaUsuarios;
	}

	public long salvar(Usuario usuario) {
		long id = ++this.id;
		usuario.setId(id);
		tablaUsuarios.put(id, usuario);
		return id;
	}

}
