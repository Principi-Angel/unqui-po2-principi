package ar.edu.unq.po2.tp6.banco;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private Double sueldoNetoMensual;
	private Propiedad propiedad;
	
	public Double getSueldoAnual() {
		return sueldoNetoMensual * 12;
	}
	
	public Double getSueldoMensual() {
		return sueldoNetoMensual;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public int getEdad() {
		return edad;
	}
}