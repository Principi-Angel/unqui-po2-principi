package tp4.supermercado;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

import org.junit.jupiter.api.BeforeEach;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		arroz = new ProductoPrimeraNecesidad("Arroz", 10d, false, 8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioArroz() {
		assertEquals(9.2, arroz.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioLecheConDescuento() {
		ProductoPrimeraNecesidad lecheDto;
		lecheDto = new ProductoPrimeraNecesidad("LecheDto", 8d, false, 11);
		assertEquals(7.12, lecheDto.getPrecio());
	}
	
	
}