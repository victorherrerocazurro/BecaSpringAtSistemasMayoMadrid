package com.atsistemas.ejercicio.negocio;

import com.atsistemas.ejercicio.persistencia.FacturaDao;

public class NegocioImpl implements Negocio {

	private FacturaDao facturaDao;
	
	public NegocioImpl(FacturaDao facturaDao) {
		super();
		this.facturaDao = facturaDao;
	}



	/**
	 * Metodo que recibiendo el identificador de una Factura, 
	 * envia un correo electronico al cliente y al comercial
	 * asociados a la factura
	 * 
	 * @param integer
	 */
	@Override
	public void enviarCorreoElectronico(Integer idFactura) {
		//Si necesito el correo electronico del cliente y de l comercial, necesito
		//alguien que me los de, a partir del id de la factura
		
		System.out.println("Enviar correo electronico");
		
	}


}
