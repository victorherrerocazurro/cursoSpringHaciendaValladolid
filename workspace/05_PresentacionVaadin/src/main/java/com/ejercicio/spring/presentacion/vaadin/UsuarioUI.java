package com.ejercicio.spring.presentacion.vaadin;

import org.springframework.beans.factory.annotation.Autowired;

import com.ejercicio.spring.core.entidades.Usuario;
import com.ejercicio.spring.core.servicios.ServicioUsuario;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class UsuarioUI extends UI{

	private static final long serialVersionUID = 1L;
	
	TextField nombre = new TextField("Nombre");
	TextField apellido = new TextField("Apellido");

	Button save = new Button("Guardar");
	
	private ServicioUsuario servicioUsuario;
	
	@Autowired
	public UsuarioUI(ServicioUsuario servicioUsuario) {
		super();
		this.servicioUsuario = servicioUsuario;
	}

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout verticalLayout = new VerticalLayout(nombre, apellido, save);
		
		setContent(verticalLayout);
		
		save.addClickListener(e -> servicioUsuario.altaUsuario(new Usuario(nombre.getValue(), apellido.getValue())));
	}

}
