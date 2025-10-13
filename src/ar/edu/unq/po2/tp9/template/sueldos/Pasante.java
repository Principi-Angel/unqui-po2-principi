package ar.edu.unq.po2.tp9.template.sueldos;

public class Pasante extends Empleado {
	
	public Pasante(Double cantHorasT, int cantHijos, EstadoCivil estadoCivil) {
		this.setCantHijos(cantHijos);
		this.setCantHorasTrabajadas(cantHorasT);
		this.setEstadoCivil(estadoCivil);
	}
	
	@Override
	protected Double sueldoBasico() {
		return 0d;
	}

	@Override
	protected Double montoFamiliar() {
		return 0d;
	}

	@Override
	protected Double valorHoraTrabajada() {
		return 40d;
	}

}
