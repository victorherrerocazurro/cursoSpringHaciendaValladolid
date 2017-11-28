package com.curso.spring.patrones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {
	public static void main(String[] args) {

		//No gestionado por spring
		Factoria factoria = new Factoria();
		
		//No gestionado por spring
		Renault megane = factoria.getMegane();
		
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Configuracion.class);
		
		//Gestionado por spring, el mismo objeto que el no gestionado por Spring, pero 
		//envuelto por un Proxy
		Singleton singleton = applicationContext.getBean(Singleton.class);
		
		//No gestionado por spring, pero el mismo objeto que el que maneja Spring, 
		//la diferencia es que la referencia que retorna Spring es a un Proxy
		Singleton singleton2 = Singleton.getInstance();
		
		//No gestionado por spring, pero el mismo objeto que el que maneja Spring, 
		//la diferencia es que la referencia que retorna Spring es a un Proxy
		Singleton singleton3 = Singleton.getInstance();
		
		//Gestionado por spring
		Factoria factoria2 = applicationContext.getBean(Factoria.class);		
		
		//No gestionado por spring
		Factoria factoria3 = new Factoria();
		
		//Gestionado por spring
		Factoria factoria4 = applicationContext.getBean(Factoria.class);
		
		//No gestionado por spring
		Renault megane2 = factoria4.getMegane();
		
		//Gestionado por spring
		Renault megane3 = applicationContext.getBean("megane", Renault.class);
		
		
	}
}
