package ar.edu.unq.po2.tp8.composite.sistemaDeArchivos;

import java.time.LocalDate;

public class Archivo extends FyleSystemClass {
	private LocalDate fechaModificacion;
	
	public Archivo(String nombre) {
		this.setNombre(nombre);
		this.fechaModificacion = LocalDate.now();
	}

	@Override
	public int totalSize() {
		return this.getNombre().length();
	}

	@Override
	public void printStructure() {
		System.out.println("		" + this.getNombre());
	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
	}

	@Override
	public LocalDate fechaUltimaModificacion() {
		return fechaModificacion;
	}


}
