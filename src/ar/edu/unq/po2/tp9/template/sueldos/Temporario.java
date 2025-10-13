package ar.edu.unq.po2.tp9.template.sueldos;

public class Temporario extends Empleado {
	
	public Temporario(Double cantHorasT, int cantHijos, EstadoCivil estadoCivil) {
		this.setCantHijos(cantHijos);
		this.setCantHorasTrabajadas(cantHorasT);
		this.setEstadoCivil(estadoCivil);
	}
	
	@Override
	protected Double sueldoBasico() {
		return 1000d;
	}

	@Override
	protected Double valorHoraTrabajada() {
		return 5d;
	}

	@Override
	protected Double montoFamiliar() {
		if(this.getEstado().getTieneConyuge() || (this.getCantHijos() > 0)) {
			return 100d;
		} else {
			return 0d;
		}
	}
}