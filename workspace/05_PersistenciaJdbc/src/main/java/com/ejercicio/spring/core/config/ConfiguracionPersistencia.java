package com.ejercicio.spring.core.config;

import java.sql.Types;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;

import com.ejercicio.spring.core.persistencia.UsuarioRepository;
import com.ejercicio.spring.core.persistencia.jdbc.UsuarioRepositoryJdbc;

@Configuration
public class ConfiguracionPersistencia {

	@Bean
	public PreparedStatementCreatorFactory consultaInsercionUsuario(
								@Value("${consultas.usuario.insert:INSERT INTO USUARIOS (NOMBRE, APELLIDO) VALUES (?, ?)}") String sql) {
		PreparedStatementCreatorFactory factory 
						= new PreparedStatementCreatorFactory(
								sql, 
								new int[]{Types.VARCHAR, Types.VARCHAR});
		factory.setReturnGeneratedKeys(true);
		return factory;
	}
	
	//Lo quito porque Spring Boot nos da ya un datasource y si dejamos dos, entran en conflicto
	/*@Bean
	public DataSource dataSource(
			@Value("${jdbc.datasource.driverclassname:org.apache.derby.jdbc.ClientDriver}") String driverClassName, 
			@Value("${jdbc.datasource.password:admin}") String password, 
			@Value("${jdbc.datasource.username:admin}") String user, 
			@Value("${jdbc.datasource.url:jdbc:derby://localhost:1527/Usuarios?create=true}") String url) {
		BasicDataSource ds = new BasicDataSource();
		
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		ds.setDriverClassName(driverClassName);
		
		return ds;
	}*/
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	
	@Bean
	@Autowired
	public UsuarioRepository usuarioRepostory(
			JdbcTemplate jdbcTemplate,
			@Qualifier("consultaInsercionUsuario") PreparedStatementCreatorFactory preparedStatementCreatorFactoryInsertUsuario, 
			@Value("${consultas.usuario.todos:SELECT * FROM USUARIOS}") String consultaTodos) {
		return new UsuarioRepositoryJdbc(jdbcTemplate, preparedStatementCreatorFactoryInsertUsuario, consultaTodos);
	}
	
}
