package com.atsistemas.ejercicio.servicio;

import com.atsistemas.ejercicio.entidades.Factura;

public interface Servicio {
	void altaFactura (Factura factura);
	void bajaFactura (Integer id);
	void modificacionFactura (Factura factura);
	Factura busquedaPorId (Integer id);
}
