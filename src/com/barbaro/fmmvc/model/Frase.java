package com.barbaro.fmmvc.model;

import java.sql.Date;

public class Frase {
	private int idFrase;
	private String contenido;
	private int cantidad;
	private Date fechaDesde;
	private Date fecha;
	
	public Frase() {
		
	}

	public Frase(int idFrase, String contenido, int cantidad, Date fechaDesde, Date fecha) {
		this.idFrase = idFrase;
		this.contenido = contenido;
		this.cantidad = cantidad;
		this.fechaDesde = fechaDesde;
		this.fecha = fecha;
	}



	public int getIdFrase() {
		return idFrase;
	}

	public void setIdFrase(int idFrase) {
		this.idFrase = idFrase;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

	

}

