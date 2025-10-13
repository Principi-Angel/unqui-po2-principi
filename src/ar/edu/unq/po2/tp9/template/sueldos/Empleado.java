package ar.edu.unq.po2.tp9.template.sueldos;

public abstract class Empleado {
	private int cantHijos;
	private EstadoCivil estadoCivil;
	private Double cantHorasTrabajadas;
	
	public final Double sueldo() {
		return (this.sueldoBasico() + this.montoFamiliar() + this.montoPorHorasTrabajadas()) * 0.87d;
	}
	
	protected abstract Double sueldoBasico();
	
	protected abstract Double montoFamiliar();
	
	protected Double valorPorHijo() {
		return 0d;
	}

	private Double montoPorHorasTrabajadas() {
		return cantHorasTrabajadas * this.valorHoraTrabajada();
	}

	protected abstract Double valorHoraTrabajada();
	
	protected EstadoCivil getEstado() {
		return estadoCivil;
	}
	
	protected int getCantHijos() {
		return cantHijos;
	}
	
	protected void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	protected void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	protected void setCantHorasTrabajadas(Double cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}
	
	

}
