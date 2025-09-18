package tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.cajaMercadoCentral.Cliente;
import ar.edu.unq.po2.tp5.cajaMercadoCentral.ProductoCooperativa;
import ar.edu.unq.po2.tp5.cajaMercadoCentral.ProductoTradicional;
import ar.edu.unq.po2.tp5.cajaMercadoCentral.Sistema;

class mercadoCentralTest {
	ProductoTradicional aceite;
	ProductoTradicional atun;
	ProductoCooperativa galletitas;
	ProductoCooperativa crema;
	Cliente pepe = new Cliente();
	Sistema sistema = new Sistema();
	
	@BeforeEach
	void setUp() throws Exception {
		aceite = new ProductoTradicional(15d, 15);
		atun = new ProductoTradicional(20d, 0);
		galletitas = new ProductoCooperativa(5d, 8); // 4.5f
		crema = new ProductoCooperativa(20d, 1); // 18f
		sistema.agregarItem(aceite);
		sistema.agregarItem(atun);
		sistema.agregarItem(galletitas);
		sistema.agregarItem(crema);
		sistema.registrarItems(pepe);
	}

	@Test
	void test() {
		assertEquals(37.50d, pepe.getMontoAPagar()*(100/100.00d));
	}

}
