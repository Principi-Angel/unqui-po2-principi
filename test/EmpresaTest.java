import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;



import ar.edu.unq.po2.tp2.Empresa;
import ar.edu.unq.po2.tp2.Estado;
import ar.edu.unq.po2.tp2.Permanente;
import ar.edu.unq.po2.tp2.Temporario;


class EmpresaTest {

	Empresa empresa = new Empresa("POO2", "30-12345678-9");
	Estado casado = new Estado(true);
	Estado soltero = new Estado(false);
	float sueldoBasico = 100;

	Permanente ana = new Permanente("Ana", "Calle Falsa 123", casado,
            LocalDate.of(1985, 5, 20), sueldoBasico, 2, 10);

	Temporario juan = new Temporario("Juan", "Av. Siempreviva 742", soltero,
            LocalDate.of(1970, 8, 10), sueldoBasico, LocalDate.of(2025, 12, 31), 15);


	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void test() {
		assertEquals(0, empresa.totalSueldosBrutos());
        assertEquals(0, empresa.totalSueldosBrutos());
		empresa.agregarEmpleado(ana);
		assertEquals(1000, empresa.totalSueldosBrutos());
		assertEquals(290, empresa.totalRetenciones());
        assertEquals(710, empresa.totalSueldosNetos());
        empresa.agregarEmpleado(juan);
		assertEquals(1700, empresa.totalSueldosBrutos());
        assertEquals(1240, empresa.totalSueldosNetos());
	}

}
