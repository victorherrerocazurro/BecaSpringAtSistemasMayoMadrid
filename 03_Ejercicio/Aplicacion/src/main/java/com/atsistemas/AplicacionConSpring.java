package com.atsistemas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atsistemas.ejercicio.controlador.Controlador;
import com.atsistemas.ejercicio.entidades.Factura;
import com.atsistemas.ejercicio.vista.Vista;

public class AplicacionConSpring {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Controlador controlador = contexto.getBean("controlador", Controlador.class);

		Factura factura = new Factura(1);
		controlador.altaFactura(factura);

		Vista busquedaPorId = controlador.busquedaPorId(1);

		System.out.println(busquedaPorId);

	}

}
