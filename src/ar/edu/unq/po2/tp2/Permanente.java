package ar.edu.unq.po2.tp2;

import java.time.LocalDate;


public class Permanente extends Planta{
	private int cantHijos;
	private int antiguedad; // en años
	public Permanente(String nombre, String direccion, Estado estadoCivil, LocalDate fechaNacimiento, float sueldoBasico,
			int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	
	@Override
	public float sueldoBruto() {
		return super.sueldoBruto() + this.sueldoFamiliar() + this.montoAntiguedad();
	}
	
	private float montoAntiguedad() {
		return antiguedad * this.valorAntiguedad();
	}
	
	private int valorAntiguedad() {
		return 50;
	}

	private float sueldoFamiliar() {
		return this.asignacionHijo() + this.asignacionConyuge();
	}
	
	private float asignacionConyuge() {
		if(this.tieneConyuge()) { return this.montoConyuge(); } else { return 0; }
	}

	private float montoConyuge() {
		return 100;
	}

	private float asignacionHijo() {
		return this.montoPorHijo() * cantHijos;
	}
	
	private float montoPorHijo() {
		return 150;
	}
	
	private float montoPorHijoObraSocial() {
		return 20;
	}
	
	
	@Override
	protected float extraObraSocial() {
		return cantHijos * this.montoPorHijoObraSocial();
	}
	
	@Override
	protected float montoAportes() {
		return (float) (0.15 * this.sueldoBruto());
	}
	
	@Override
	protected float extraAportes() { return 0; }
	
	@Override
	protected String conceptosGanancias() {
		return "SueldoBasico: " + sueldoBasico + 
                "Salario Familiar: " +  
                "	Asignacion por hijo" + this.asignacionHijo() +
                "	SAsignacion por conyuge " + this.asignacionConyuge() +
                "Antiguedad: " + this.montoAntiguedad() +
                this.conceptosRetenciones();
	}
	
}

