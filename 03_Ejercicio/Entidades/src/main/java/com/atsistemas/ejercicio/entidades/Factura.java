package com.atsistemas.ejercicio.entidades;

import java.io.Serializable;

public class Factura implements Serializable{
	
	private static final long serialVersionUID = -5017014829782524037L;
	
	//PK - Donde ponemos integer para soportar la autogeneracion del valoren la BD
	private Integer id;

	//Por facilitar el desarrollo
	public Factura(Integer id) {
		super();
		this.id = id;
	}
	
	//Por integra con posibles frameworks como Hibernate
	public Factura() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
