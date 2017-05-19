package com.atsistemas._Boot.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atsistemas._Boot.entidades.Persona;

public interface PersonaDao extends JpaRepository<Persona, Integer>{

	Persona findByNombre(String nombre);
	
	@Query("from Persona p where p.nombre = :nombre")
	Persona miMetodo(String nombre);
	
}
