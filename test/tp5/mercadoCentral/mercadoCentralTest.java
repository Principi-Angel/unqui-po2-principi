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
	/*	pepe.agregarProducto(aceite);
		pepe.agregarProducto(atun);
		pepe.agregarProducto(galletitas);
		pepe.agregarProducto(crema);
		pepe.registrarProductos(sistema);*/
	}

	@Test
	void test() {
		assertEquals(37.50d, pepe.getMontoAPagar()*(100/100.00d));
	}

}
