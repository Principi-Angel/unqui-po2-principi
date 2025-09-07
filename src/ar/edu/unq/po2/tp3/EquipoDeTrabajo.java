package ar.edu.unq.po2.tp3;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class EquipoDeTrabajo {
	private String nombre;
	private Set<Integrante> integrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new HashSet<Integrante>();
	}


	public void agregarIntegrante(Integrante integrante) {
		integrantes.add(integrante);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPromedioEtarioIntegrantes() {
		 if (integrantes.isEmpty()) return 0;

	     double suma = 0;
	        
	     for (Integrante i : integrantes) {
	        	suma += i.getEdad();
	     }
	        	
	     return suma / integrantes.size();
	 }
	
	
	
	class Integrante extends Persona {
		private String apellido;
		public Integrante(String nombre, String apellido, Date fechaNacimiento){
			super(nombre, fechaNacimiento);
			this.apellido = apellido;
		}
		
		@Override
		public String getNombre() {
			return super.getNombre() + "" + apellido;
		}
	}
}