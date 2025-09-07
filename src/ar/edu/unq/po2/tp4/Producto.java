package ar.edu.unq.po2.tp4;

import java.util.function.BooleanSupplier;

public class Producto {
	private String nombre;
	private Double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, Double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Producto(String nombre, double precio) {
		this(nombre, precio, false);
	}

	public Object getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}
	
	
	
	

}
