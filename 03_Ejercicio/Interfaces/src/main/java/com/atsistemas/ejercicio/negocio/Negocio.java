package com.atsistemas.ejercicio.negocio;

/**
 * @author vdelolmo
 *
 */
public interface Negocio {
	
	/**
	 * Metodo que recibiendo el identificador de una Factura, 
	 * envia un correo electronico al cliente y al comercial
	 * asociados a la factura
	 * 
	 * @param integer
	 */
	void enviarCorreoElectronico(Integer integer);
}
