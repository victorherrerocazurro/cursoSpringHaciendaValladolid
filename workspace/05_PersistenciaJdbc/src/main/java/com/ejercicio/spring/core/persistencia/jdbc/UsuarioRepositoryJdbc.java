package com.ejercicio.spring.core.persistencia.jdbc;

import java.util.Collection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.persistencia.UsuarioRepository;

//public class UsuarioRepositoryJdbc extends JdbcDaoSupport implements UsuarioRepository{
public class UsuarioRepositoryJdbc implements UsuarioRepository{

	private JdbcTemplate jdbcTemplate;
	
	private PreparedStatementCreatorFactory preparedStatementCreatorFactoryInsertUsuario;
	
	private String consultaTodos;
	
	public UsuarioRepositoryJdbc(JdbcTemplate jdbcTemplate,
			PreparedStatementCreatorFactory preparedStatementCreatorFactoryInsertUsuario, String consultaTodos) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		//setJdbcTemplate(jdbcTemplate);
		this.preparedStatementCreatorFactoryInsertUsuario = preparedStatementCreatorFactoryInsertUsuario;
		this.consultaTodos = consultaTodos;
	}



	public long salvar(Usuario usuario) {
		KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		PreparedStatementCreator psc 
						= preparedStatementCreatorFactoryInsertUsuario
										.newPreparedStatementCreator(
												atributosParaInsertarUsuario(usuario));
		jdbcTemplate.update(psc, generatedKeyHolder);
		return generatedKeyHolder.getKey().longValue();
	}

	public Collection<Usuario> consultarTodos() {
		//TODO extraer el objeto UsuarioRowMapper a un Bean de Spring
		return jdbcTemplate.query(consultaTodos, new UsuarioRowMapper());
	}
	
	private Object[] atributosParaInsertarUsuario(Usuario usuario) {
		return new Object[] {usuario.getNombre(), usuario.getApellido()};
	}

}
