package ar.edu.unq.po2.tp8.sistemaDeArchivos;

import java.time.LocalDate;

public abstract class FyleSystemClass implements FyleSystem {
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract LocalDate fechaUltimaModificacion();
	
	public abstract int totalSize();
	public abstract void printStructure();
	public abstract FyleSystem lastModified();
	public abstract FyleSystem oldestElement();

}
