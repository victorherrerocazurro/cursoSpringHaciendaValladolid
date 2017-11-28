package com.curso.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Para que sea Bean de Spring, junto con @ComponentScan
@Component
//Para que sea un Aspecto de AspectJ
@Aspect
public class Aspecto {

	//Para que ejecute antes de la ejecucion del metodo de servicio el aspecto
	@Before("execution(* com.curso.spring.aop.Servicio.*())")
	public void funcionalidadAEjecutarAntesQueElServicio() {
		System.out.println("En el aspecto antes de invocar el servicio");
	}
	
	@Around("execution(* com.curso.spring.aop.Servicio.*())")
	public void otroAspecto(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("En el aspecto antes de invocar el servicio");
		pjp.proceed();
	}
	
}
