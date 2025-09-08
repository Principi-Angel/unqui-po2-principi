package tp4.impuesto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.impuesto.Ingreso;
import ar.edu.unq.po2.tp4.impuesto.IngresoPorHoraExtra;
import ar.edu.unq.po2.tp4.impuesto.Trabajador;

class TrabajadorTest {
	Ingreso sueldo;
	Ingreso jornada;
	IngresoPorHoraExtra horasExtras;
	Trabajador t;
	
	@BeforeEach
	void setUp() {
		sueldo = new Ingreso(10, "Sueldo", 1000);
		jornada = new Ingreso(10, "Jornada", 60);
		horasExtras = new IngresoPorHoraExtra(10, "Horas Extras", 4f, 25f);
		t = new Trabajador();
		t.agregarIngreso(sueldo);
	}
	
	@Test
	void testTrabajadorSoloConSueldoQueEsImpnoible() {
		assertEquals(1000, t.getTotalPercibido());
		assertEquals(1000, t.getMontoImponible());
		assertEquals(20, t.getImpuestoAPagar());
	}
	
	@Test
	void testTrabajadorConHoraExtra() {
		t.agregarIngreso(horasExtras);
		t.agregarIngreso(jornada);
		assertEquals(1160, t.getTotalPercibido());
		assertEquals(1060, t.getMontoImponible());
		assertEquals(21.20f, t.getImpuestoAPagar()*100/100.00f);
	}
}