package com.ejercicio.spring.core.persistencia.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ejercicio.spring.core.entidades.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario>{

	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario usuario = new Usuario(rs.getString("nombre"), rs.getString("apellido"));
		usuario.setId(rs.getLong("id"));
		return usuario;
	}

}
