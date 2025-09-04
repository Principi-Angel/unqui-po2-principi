package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected Estado estadoCivil;
	protected LocalDate fechaNacimiento;
	protected float sueldoBasico;
	
	public Empleado(String nombre, String direccion, Estado estadoCivil, LocalDate fechaNacimiento, float sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public int edad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears(); 
	}
	
	public float sueldoBruto() {
		return sueldoBasico;
	}
	
	
	public float sueldoNeto() {
		return this.sueldoBruto() - this.montoRetenciones();
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
	
	protected boolean tieneConyuge() {
		return estadoCivil.getTieneConyuge();
	}
	
	public void generarRecibo(Empresa empresa) {
		ReciboHaberes recibo = new ReciboHaberes(nombre, direccion, LocalDate.now(), this.sueldoBruto(), this.sueldoNeto(), this.conceptos());
		empresa.recibirRecibo(recibo);
	}
	
	protected String conceptos() {
		return this.conceptosGanancias() +
				this.conceptosRetenciones();
	}
	 
	protected String conceptosGanancias() {
		return "SueldoBasico: " + sueldoBasico;
	}
	
	protected String conceptosRetenciones() {
		return "Obra Social: " + this.retencionPorObraSocial() +
				"Aportes Jubilatorios: " + this.retencionPorAportes();
	}
}

