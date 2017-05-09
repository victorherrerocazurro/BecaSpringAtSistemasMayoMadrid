package com.atsistemas.ejercicio.servicio;

import com.atsistemas.ejercicio.entidades.Factura;
import com.atsistemas.ejercicio.negocio.Negocio;
import com.atsistemas.ejercicio.persistencia.FacturaDao;

public class ServicioImpl implements Servicio {

	private Negocio negocio;
	private FacturaDao facturaDao;
	
	public ServicioImpl(Negocio negocio, FacturaDao facturaDao) {
		super();
		this.negocio = negocio;
		this.facturaDao = facturaDao;
	}

	/**
	 * Metodo que cubre el requisito de dar de alta la factura en la BBDD enviando un correo electronico al
	 * responsable
	 */
	public void altaFactura(Factura factura) {
		try {
			facturaDao.save(factura);
			negocio.enviarCorreoElectronico();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public void bajaFactura(Integer id) {
		facturaDao.delete(id);
		
	}

	public Factura busquedaPorId(Integer id) {
		return facturaDao.selectById(id);
	}

	public void modificacionFactura(Factura factura) {
		facturaDao.update(factura);		
	}
}