package com.atsistemas;

import com.atsistemas.persistencia.Persistencia;

public class Negocio {

	//Dependencia con Persistencia
	private Persistencia persistencia;
	
	//ID
	
	//Setter
	/*public void setPersistencia(Persistencia persistencia) {
		this.persistencia = persistencia;
	}*/
	
	//Construccion (indica obligatoriedad)
	public Negocio(Persistencia persistencia) {
		super();
		this.persistencia = persistencia;
	}
	
	/*public Negocio() {
		super();
		// TODO Auto-generated constructor stub
	}*/

	public void procesarLasPersonas(){
		persistencia.guardar(null);
	}



	
	
}
