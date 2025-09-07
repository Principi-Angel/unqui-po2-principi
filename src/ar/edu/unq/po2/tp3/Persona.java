package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;


public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getEdad() {
		//LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return Period.between(fechaNacimiento, LocalDate.now()).getYears(); 
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
}
