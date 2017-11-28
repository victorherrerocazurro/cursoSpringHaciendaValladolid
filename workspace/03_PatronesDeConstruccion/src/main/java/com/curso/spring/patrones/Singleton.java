package com.curso.spring.patrones;

public class Singleton {

	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
