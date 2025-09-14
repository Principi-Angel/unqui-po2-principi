package tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.cajaMercadoCentral.ProductoCooperativa;
import ar.edu.unq.po2.tp5.cajaMercadoCentral.ProductoTradicional;

class TestProducto {
	ProductoTradicional aceite;
	ProductoCooperativa galletitas;
	
	@BeforeEach
	public void setUp() {
		aceite = new ProductoTradicional(15f, 15);
		galletitas = new ProductoCooperativa(6f, 8);
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
