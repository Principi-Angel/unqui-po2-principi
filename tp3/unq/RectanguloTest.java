package unq;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Punto;
import ar.edu.unq.po2.tp3.Rectangulo;

class RectanguloTest {
	Punto p = new Punto();
	Rectangulo r; 
	Punto a = new Punto(4,4);
	Cuadrado c;
	@Test
	void testRectangulo4X5() {
		r = new Rectangulo(p, 4, 5);
		assertEquals(18, r.perimetro());
		assertEquals(20, r.area());
		assertTrue(r.esVertical());
		assertFalse(r.esHorizontal());
	}
	
	@Test
	void testRectangulo7X6() {
		r = new Rectangulo(p, 7, 6);
		assertEquals(26, r.perimetro());
		assertEquals(42, r.area());
		assertTrue(r.esHorizontal());
		assertFalse(r.esVertical());
	}
	
	@Test
	void testCuadrado5x5() {
		c = new Cuadrado(a, 5);
		assertEquals(20, c.perimetro());
		assertEquals(25, c.area());
		assertFalse(c.esHorizontal());
		assertFalse(c.esVertical());
	}
}
