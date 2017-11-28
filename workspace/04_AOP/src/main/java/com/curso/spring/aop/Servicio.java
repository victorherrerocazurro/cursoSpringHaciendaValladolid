package com.curso.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Para que sea Bean de Spring, junto con @ComponentScan
@Service
public class Servicio {

	private Dao dao;
	
	//Le pide a Spring un Bean de tipo Dao
	@Autowired
	public Servicio(Dao dao) {
		this.dao= dao;
	}
	
	public void metodo() {
		System.out.println("Funcionalidad que queremos ver afectada por el aspecto");
	}
	
	public void otro() {
		System.out.println("Funcionalidad que queremos ver afectada por el aspecto");
	}
	
}
