package com.atsistemas.ejercicio.persistencia;

import com.atsistemas.ejercicio.entidades.Factura;

public interface FacturaDao {
	void save(Factura factura);
	void update(Factura factura);
	void delete(Integer id);
	Factura selectById(Integer id);
}
