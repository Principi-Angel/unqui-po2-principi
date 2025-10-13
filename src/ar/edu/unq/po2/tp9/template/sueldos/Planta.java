package ar.edu.unq.po2.tp9.template.sueldos;

public class Planta extends Empleado {
	
	public Planta(Double cantHorasT, int cantHijos, EstadoCivil estadoCivil) {
		this.setCantHijos(cantHijos);
		this.setCantHorasTrabajadas(cantHorasT);
		this.setEstadoCivil(estadoCivil);
	}
	
	@Override
	protected Double sueldoBasico() {
		return 3000d;
	}

	@Override
	protected Double montoFamiliar() {
		return this.getCantHijos() * this.valorPorHijo();
	}
	
	@Override
	protected Double valorPorHijo() {
		return 150d;
	}

	@Override
	protected Double valorHoraTrabajada() {
		return 0d;
	}

}
