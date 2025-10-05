package ar.edu.unq.po2.tp7pokerStatus;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.PokerStatus;

import static org.mockito.Mockito.*;

class PokerStatusTest {
	
	PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}
	
	@Test
	void testCincoCartasMismoValor() {
		assertFalse(pokerStatus.verificar("KP","KC","KD","KT", "KP"));
	}
	
	@Test
	void testNingunaCartaMismoValor() {
		assertFalse(pokerStatus.verificar("10P","KC","QD","9T", "JP"));
	}
	
	@Test
	void testHayPoker() {
		assertTrue(pokerStatus.verificar("QP","QC","QD","QT", "KP"));
	}
	
	@Test
	void testHayTrio() {
		assertFalse(pokerStatus.verificar("1P","2C","1D","1T", "QT"));
	}
	
	@Test
	void testHayColor() {
		assertEquals("Color", pokerStatus.verificar(4D, 5D, 6D, KD, QD));
	}
}

/*
 * set up -> el "armado" del test, en este caso la instanciación del pokerstatus
 * excersive -> invocación verificar(..)
 * verify -> assert
 * teardown -> no aplica en este caso
 * */
