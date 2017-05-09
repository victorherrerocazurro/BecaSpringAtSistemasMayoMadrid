package com.atsistemas;

import com.atsistemas.ejercicio.controlador.Controlador;
import com.atsistemas.ejercicio.entidades.Factura;
import com.atsistemas.ejercicio.vista.Vista;

public class Aplicacion {
	public static void main(String[] args) {

		SpringDeLosChinos contexto = new SpringDeLosChinos();
		
		Controlador controlador = contexto.getControlador();
		
		Factura factura = new Factura(1);
		controlador.altaFactura(factura);
		
		Vista busquedaPorId = controlador.busquedaPorId(1);
		
		System.out.println(busquedaPorId);
		
	}
}
