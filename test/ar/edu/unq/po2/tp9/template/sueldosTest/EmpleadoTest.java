package ar.edu.unq.po2.tp9.template.sueldosTest;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.template.sueldos.Empleado;
import ar.edu.unq.po2.tp9.template.sueldos.EstadoCivil;
import ar.edu.unq.po2.tp9.template.sueldos.Pasante;
import ar.edu.unq.po2.tp9.template.sueldos.Temporario;

class EmpleadoTest {
	EstadoCivil soltero;
	EstadoCivil casado;

	Empleado temporarioSolteroSinHijos = new Temporario(10d, 0, soltero);
	Empleado temporarioDivorciadoConHijos = new Temporario(8d, 2, soltero);
	Empleado temporarioCasadoCon3Hijos = new Temporario(20d, 3, casado);
	
	Empleado pasanteSolteroConHijos;
	Empleado pasanteSolteroSinHijos;
	Empleado pasanteCasadoConHijos;
	Empleado pasanteCasadoSinHijos;
	
	Empleado plantaCon5HijosY50Hs;
	Empleado plantaCon0HijosY40Hs;
	Empleado plantaCon1HijosY25Hs;
	Empleado plantaCon2HijosY0Hs;
	
	@BeforeEach
	void setUp() throws Exception {
		soltero = mock(EstadoCivil.class);
		casado = mock(EstadoCivil.class);
		when(soltero.getTieneConyuge()).thenReturn(false);
		when(casado.getTieneConyuge()).thenReturn(false);

		temporarioSolteroSinHijos = new Temporario(10d, 0, soltero);
		temporarioDivorciadoConHijos = new Temporario(8d, 2, soltero);
		temporarioCasadoCon3Hijos = new Temporario(20d, 3, casado);
		
		pasanteSolteroConHijos = new Pasante(10d,2, soltero);
		pasanteSolteroSinHijos = new Pasante(10d,0, soltero);
		pasanteCasadoConHijos = new Pasante(10d,1, casado);
		pasanteCasadoSinHijos = new Pasante(10d,0, casado);
		
		/*plantaCon5HijosY50Hs;
		Empleado plantaCon0HijosY40Hs;
		Empleado plantaCon1HijosY25Hs;
		Empleado plantaCon2HijosY0Hs;*/
	}

	@Test
	void testTemporarioSolteroSinHijos10HsCobra$913y50c() {
		assertEquals(913.5d, temporarioSolteroSinHijos.sueldo());
	}
	
	@Test
	void testTemporarioSolteroConHijos8HsCobra$991y80c() {
		assertEquals(991.8d, temporarioDivorciadoConHijos.sueldo());
	}
	
	@Test
	void testTemporarioSolteroConHijos20HsCobra1044() {
		assertEquals(1044, temporarioCasadoCon3Hijos.sueldo());
	}
	
	@Test
	void testPasanteSolteroConHijosCobra348() {
		assertEquals(348, pasanteSolteroConHijos.sueldo());
	}
	
	@Test
	void testPasanteSolteroSinHijosCobra348() {
		assertEquals(348, pasanteSolteroSinHijos.sueldo());
	}
	
	@Test
	void testPasanteCasadoConHijosCobra348() {
		assertEquals(348, pasanteCasadoConHijos.sueldo());
	}
	
	@Test
	void testPasanteCasadoSinHijosCobra348() {
		assertEquals(348, pasanteCasadoSinHijos.sueldo());
	}
	
	

	

}
