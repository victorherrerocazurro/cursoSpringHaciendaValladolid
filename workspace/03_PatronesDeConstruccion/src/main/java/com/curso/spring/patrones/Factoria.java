package com.curso.spring.patrones;

public class Factoria {

	public Renault getMegane() {
		return new Megane();
	}
	
	public Renault getClio() {
		return new Clio();
	}
	
	
	private class Megane implements Renault {

	}

	private class Clio implements Renault {

	}

}
