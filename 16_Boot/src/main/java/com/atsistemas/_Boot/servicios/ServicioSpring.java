package com.atsistemas._Boot.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas._Boot.entidades.Persona;
import com.atsistemas._Boot.persistencia.PersonaDao;

@Service
public class ServicioSpring implements Servicio {

	@Autowired
	private PersonaDao personaDao;
	
	public void setPersonaDao(PersonaDao personaDao) {
		this.personaDao = personaDao;
	}

	/* (non-Javadoc)
	 * @see com.atsistemas._Boot.servicios.Servicio#guardarPersona(com.atsistemas._Boot.entidades.Persona)
	 */
	@Override
	public void guardarPersona(Persona persona){
		personaDao.save(persona);
	}
	
	/* (non-Javadoc)
	 * @see com.atsistemas._Boot.servicios.Servicio#consultarPersonaPorNombre(java.lang.String)
	 */
	@Override
	public Persona consultarPersonaPorNombre(String nombre){
		return personaDao.findByNombre(nombre);
	}
	
}
