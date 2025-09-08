package tp4.impuesto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.impuesto.Ingreso;
import ar.edu.unq.po2.tp4.impuesto.IngresoPorHoraExtra;

class IngresolTest {
	Ingreso sueldo;
	Ingreso jornada;
	IngresoPorHoraExtra horasExtras;
	
	@BeforeEach
	void setUp() {
		sueldo = new Ingreso(10, "Sueldo", 1000);
		jornada = new Ingreso(10, "Jornada", 60);
		horasExtras = new IngresoPorHoraExtra(10, "Horas Extras", 4f, 25f);
	}
	
	@Test
	void testDelMontoDeSueldo() {
		assertEquals(1000, sueldo.getMonto());
	}
	
	@Test
	void testMontoDeHorasExtras() {
		assertEquals(100, horasExtras.getMonto());
	}
	
	@Test
	void testEsImponibleJornada() {
		assertTrue(jornada.getEsImponible());
	}
	
	@Test
	void testEsImponibleHorasExtras() {
		assertFalse(horasExtras.getEsImponible());
	}
}
