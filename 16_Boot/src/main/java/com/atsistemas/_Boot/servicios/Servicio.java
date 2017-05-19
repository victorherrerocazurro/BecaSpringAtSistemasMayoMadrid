package com.atsistemas._Boot.servicios;

import com.atsistemas._Boot.entidades.Persona;

public interface Servicio {

	void guardarPersona(Persona persona);

	Persona consultarPersonaPorNombre(String nombre);

}