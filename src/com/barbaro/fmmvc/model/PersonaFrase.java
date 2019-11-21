package com.barbaro.fmmvc.model;

import java.util.Date;

public class PersonaFrase {
	private int idPersonaFrase;
	private int id_frase;
	private int id_persona;
	private Date fecha;
	
	public PersonaFrase() {
	
	}
	
	

	public PersonaFrase(int idPersonaFrase, int id_frase, int id_persona, Date fecha) {
		super();
		this.idPersonaFrase = idPersonaFrase;
		this.id_frase = id_frase;
		this.id_persona = id_persona;
		this.fecha = fecha;
	}



	public int getIdPersonaFrase() {
		return idPersonaFrase;
	}

	public void setIdPersonaFrase(int idPersonaFrase) {
		this.idPersonaFrase = idPersonaFrase;
	}

	public int getId_frase() {
		return id_frase;
	}

	public void setId_frase(int id_frase) {
		this.id_frase = id_frase;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}

