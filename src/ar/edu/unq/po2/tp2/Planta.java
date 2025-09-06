package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public abstract class Planta extends Empleado {

	public Planta(String nombre, String direccion, Estado estadoCivil, LocalDate fechaNacimiento, float sueldoBasico) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
	}

	public float montoRetenciones() {
		return this.retencionPorObraSocial() + this.retencionPorAportes();
	}
	
	protected float retencionPorObraSocial() {
		return this.montoObraSocial() + this.extraObraSocial();
	}
	
	protected float retencionPorAportes() {
		return this.montoAportes() + this.extraAportes();
	}
	
	protected float montoObraSocial() {
		return (float) (0.1 * this.sueldoBruto());
	}
	
	protected abstract float extraObraSocial();
	protected abstract float montoAportes();
	protected abstract float extraAportes();
	
	protected String conceptosRetenciones() {
		return "Obra Social: " + this.retencionPorObraSocial() +
				"Aportes Jubilatorios: " + this.retencionPorAportes();
	}
	

}
