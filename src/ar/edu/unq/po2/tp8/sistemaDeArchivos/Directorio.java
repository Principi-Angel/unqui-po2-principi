package ar.edu.unq.po2.tp8.sistemaDeArchivos;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Directorio extends FyleSystemClass {
	private LocalDate fechaCreacion;
	private List<FyleSystem> documentos = new LinkedList<FyleSystem>();
	
	public Directorio(String nombre) {
		this.setNombre(nombre);
		this.fechaCreacion = LocalDate.now();
	}
	
	@Override
	public int totalSize() {
		return documentos.stream()
				.mapToInt(documento -> documento.totalSize())
				.sum();
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public FyleSystem oldestElement() {
		return null;
	}
	
	@Override
	public FyleSystem lastModified() {
		return documentos.stream()
			        .map(FyleSystem::lastModified)
			        .max(Comparator.comparing(documento -> documento.fechaUltimaModificacion()))
			        .orElse(this);
	}

	@Override
	public LocalDate fechaUltimaModificacion() {
		return documentos.stream()
				   .map(FyleSystem::fechaUltimaModificacion)
				   .max(LocalDate::compareTo)
				   .orElse(fechaCreacion);
	}
}