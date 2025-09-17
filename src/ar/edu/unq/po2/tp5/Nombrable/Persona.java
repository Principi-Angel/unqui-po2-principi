package ar.edu.unq.po2.tp5.Nombrable;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable {
	private String name;
	private LocalDate birthDate;

	public String getName() {
		return name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public int getAge() {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}
	
    public boolean esMenorQue(Persona persona) {
        return this.getAge() < persona.getAge();
    }
}
