package ar.edu.unq.po2.tp7pokerStatus;

import static org.junit.jupiter.api.Assertions.*;




import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.PokerStatus;
import ar.edu.unq.po2.tp7pokerStatus.Carta.CartaDePicas;
import ar.edu.unq.po2.tp7pokerStatus.Carta.CartaDeDiamantes;
import ar.edu.unq.po2.tp7pokerStatus.Carta.CartaDeTreboles;
import ar.edu.unq.po2.tp7pokerStatus.Carta.CartaDeCorazones;
import ar.edu.unq.po2.tp7pokerStatus.Carta.Valor;
import static org.mockito.Mockito.*;

class PokerStatusTest {
	
	PokerStatus pokerStatus;

	CartaDePicas kP;
	CartaDeDiamantes kD;
	CartaDeTreboles kT;
	CartaDeCorazones kC;
	CartaDeCorazones diezC;
	CartaDeCorazones nueveC;
	CartaDeCorazones ochoC;
	CartaDeCorazones sieteC;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		kP = new CartaDePicas(Valor.CK);
		kD = new CartaDeDiamantes(Valor.CK);
		kT = new CartaDeTreboles(Valor.CK);
		kC = new CartaDeCorazones(Valor.CK);
		diezC = new CartaDeCorazones(Valor.C10);
		nueveC = new CartaDeCorazones(Valor.C9);
		ochoC = new CartaDeCorazones(Valor.C8);
		sieteC = new CartaDeCorazones(Valor.C7);
	}
	
	@Test
	void testCincoCartasMismoValor() {
		assertEquals("Nada", pokerStatus.verificar(kP,kC,kD,kT,kT));
	}
	
	@Test
	void testNingunaCartaMismoValor() {
		assertEquals("Nada", pokerStatus.verificar(kP,diezC,nueveC, ochoC,sieteC));
	}
	
	@Test
	void testHayPoker() {
		assertEquals("Poker", pokerStatus.verificar(kP,kC,kD,kT,nueveC));
	}
	
	@Test
	void testHayTrio() {
		assertEquals("Trio", pokerStatus.verificar(kP,kC,kD,diezC,nueveC));
	}
	
	@Test
	void testHayColor() {
		assertEquals("Color", pokerStatus.verificar(kC,diezC,nueveC,ochoC,sieteC));
	}
	
	@Test
	void testNOHayColor() {
		assertEquals("Nada", pokerStatus.verificar(kD,diezC,nueveC, ochoC,sieteC));
	}
}

/*
 * set up -> el "armado" del test, en este caso la instanciación del pokerstatus
 * excersive -> invocación verificar(..)
 * verify -> assert
 * teardown -> no aplica en este caso
 * */
