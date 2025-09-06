package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Contratado extends Empleado {
	private int numContraro;
	private String medioDePago;

	public Contratado(String nombre, String direccion, Estado estadoCivil, LocalDate fechaNacimiento,
			float sueldoBasico, int numContraro, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numContraro = numContraro;
		this.medioDePago = medioDePago;
	}

	@Override
	public float montoRetenciones() {
		return this.montoGastosAdmContractuales();
	}
	
	@Override
	protected String conceptosRetenciones() {
		return "Gastos Adm Contractuales: " + this.montoGastosAdmContractuales();
	}

	private float montoGastosAdmContractuales() {
		return 50;
	}
	
	
}
