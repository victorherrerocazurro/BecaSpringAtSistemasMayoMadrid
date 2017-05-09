package com.atsistemas.ejercicio.persistencia;

import java.util.Map;

import com.atsistemas.ejercicio.entidades.Factura;

public class MemoriaFacturaDao implements FacturaDao {

	private Map<Integer, Factura> tablaFacturas;
	
	//ID por constructor
	public MemoriaFacturaDao(Map<Integer, Factura> tablaFacturas) {
		super();
		this.tablaFacturas = tablaFacturas;
	}

	public void save(Factura factura) {
		tablaFacturas.put(factura.getId(), factura);
	}

	public void update(Factura factura) {
		// TODO Auto-generated method stub

	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	public Factura selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
