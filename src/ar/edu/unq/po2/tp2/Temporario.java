package ar.edu.unq.po2.tp2;

import java.time.LocalDate;


public class Temporario extends Planta {
	private LocalDate fechaFinDesignacion;
	private int cantHorasExtras;
	
	public Temporario(String nombre, String direccion, Estado estadoCivil, LocalDate fechaNacimiento, float sueldoBasico,
			LocalDate fechaFinDesignacion, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantHorasExtras = cantHorasExtras;
	}

	@Override
	public float sueldoBruto() {
		return super.sueldoBruto() + this.montoHorasExtras();
	}
	
	private float montoHorasExtras() {
		return cantHorasExtras * this.valorDeLaHoraExtra();
	}
	
	private float valorDeLaHoraExtra() {
		return 40;
	}

	@Override
	protected float extraObraSocial() {
		if(this.aplicaExtraObraSocial()) { return 25 ; } else { return 0; }
	}
	
	private boolean aplicaExtraObraSocial() {
		return this.edad() > this.edadMinimaParaAportarObraSocial();
	}
	
	private int edadMinimaParaAportarObraSocial() {
		return 50;
	}

	@Override
    protected float montoAportes() {
		return (10/100) * this.sueldoBruto();
	}

	@Override
	protected float extraAportes() {
		return cantHorasExtras * this.montoHoraExtraAporte();
	}
	
	private float montoHoraExtraAporte() { return 5; }
	
	@Override
	protected String conceptosGanancias() {
		return  super.conceptosGanancias() + 
                "Horas Extras: " + this.montoHorasExtras()
                ;
	}
	
}

