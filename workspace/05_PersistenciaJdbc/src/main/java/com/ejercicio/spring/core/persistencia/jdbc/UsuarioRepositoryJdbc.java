package com.ejercicio.spring.core.persistencia.jdbc;

import java.util.Collection;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;

public class UsuarioRepositoryJdbc implements UsuarioRepository{

	private JdbcTemplate jdbcTemplate;
	
	public UsuarioRepositoryJdbc(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public long salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Collection<Usuario> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
