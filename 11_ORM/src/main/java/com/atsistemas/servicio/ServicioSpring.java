package com.atsistemas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.entidades.Persona;
import com.atsistemas.persistencia.JpaPersonaDao;

@Service
public class ServicioSpring {

	@Autowired
	private JpaPersonaDao personaDao;
	
	public void setPersonaDao(JpaPersonaDao personaDao) {
		this.personaDao = personaDao;
	}

	public void guardarPersona(Persona persona){
		personaDao.save(persona);
	}
	
	public Persona consultarPersonaPorNombre(String nombre){
		return personaDao.findByNombre(nombre);
	}
	
}
