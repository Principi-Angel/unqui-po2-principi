package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PokerStatusTest {
	
	PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}

	@Test
	void testTresCartasMismoValor() {
		assertFalse(pokerStatus.verificar("1P","2C","1D","1T", "QT"));
	}
	
	void testCincoCartasMismoValor() {
		assertFalse(pokerStatus.verificar("KP","KC","KD","KT", "KP"));
	}
	
	void testNingunaCartaMismoValor() {
		assertFalse(pokerStatus.verificar("10P","KC","QD","9T", "JP"));
	}
	
	void testHayPoker() {
		assertTrue(pokerStatus.verificar("QP","QC","QD","QT", "KP"));
	}
}
