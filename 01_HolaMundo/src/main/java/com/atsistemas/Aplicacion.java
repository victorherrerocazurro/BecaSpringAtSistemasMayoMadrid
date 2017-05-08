package com.atsistemas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Persona();
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Persona personaSingleton1 = contexto.getBean("PersonaSingleton", Persona.class);
		
		Persona personaSingleton2 = contexto.getBean("PersonaSingleton", Persona.class);
		
		if(personaSingleton1 == personaSingleton2){
			System.out.println("Los singleton son iguales");
		}
		
		Persona personaPrototype1 = contexto.getBean("PersonaPrototype", Persona.class);
		
		Persona personaPrototype2 = contexto.getBean("PersonaPrototype", Persona.class);
		
		if(personaPrototype1 == personaPrototype2){
			System.out.println("Los prototype son iguales");
		}
		
	}
}
