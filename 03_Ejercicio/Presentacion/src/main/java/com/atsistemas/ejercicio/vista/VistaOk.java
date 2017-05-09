package com.atsistemas.ejercicio.vista;

import com.atsistemas.ejercicio.entidades.Factura;

public class VistaOk implements Vista {
	
	private Factura factura;

	public VistaOk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VistaOk(Factura factura) {
		this.factura = factura;
	}
	
	@Override
	public String toString() {
		return factura.getId().toString();
	}

}
