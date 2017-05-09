package com.atsistemas;

import java.util.HashMap;
import java.util.Map;

import com.atsistemas.ejercicio.controlador.Controlador;
import com.atsistemas.ejercicio.entidades.Factura;
import com.atsistemas.ejercicio.negocio.NegocioImpl;
import com.atsistemas.ejercicio.persistencia.MemoriaFacturaDao;
import com.atsistemas.ejercicio.servicio.ServicioImpl;

public class SpringDeLosChinos {

	private Controlador controlador;

	public SpringDeLosChinos() {
		super();
		Map<Integer, Factura> tablaFacturas = new HashMap<>();
		MemoriaFacturaDao memoriaFacturaDao = new MemoriaFacturaDao(tablaFacturas);
		NegocioImpl negocioImpl = new NegocioImpl(memoriaFacturaDao);
		ServicioImpl servicioImpl = new ServicioImpl(negocioImpl, memoriaFacturaDao);
		controlador = new Controlador(servicioImpl);
	}
	
	public Controlador getControlador(){
		return controlador;
	}

	
	
}
