package com.pranical.domain;

public class Factura {
	 private int id;
	 private String concepto;
	 private double importe;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "Factura [id=" + id + ", concepto=" + concepto + ", importe=" + importe + "]";
	}
}
