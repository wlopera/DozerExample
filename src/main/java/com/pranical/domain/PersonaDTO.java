package com.pranical.domain;

import java.sql.Date;

public class PersonaDTO {
	private String nombre;
	private String edad;
	private Date fecha;
	private double importe;
	private String concepto;
	 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	@Override
	public String toString() {
		return "PersonaDTO [nombre=" + nombre + ", edad=" + edad + ", fecha=" + fecha + ", importe=" + importe
				+ ", concepto=" + concepto + "]";
	}
}
