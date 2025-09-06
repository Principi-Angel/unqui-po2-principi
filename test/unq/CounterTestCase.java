package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {
	private Counter counter;
	int amount;
	 
	 @BeforeEach
	 public void setUp() throws Exception {
		 counter = new Counter();
		 counter.addNumber(1);
		 counter.addNumber(3);
		 counter.addNumber(5);
		 counter.addNumber(7);
		 counter.addNumber(9);
		 counter.addNumber(1);
		 counter.addNumber(1);
		 counter.addNumber(1);
		 counter.addNumber(1);
		 counter.addNumber(4);
	 }

	 // Verifica la cantidad de pares
	 @Test
	 public void testEvenNumbers() {
	 // Getting the even occurrences
		amount = counter.getEvenOcurrences();
	 // I check the amount is the expected one
	 	assertEquals(amount, 1);
	 }
	 
	 // Verifica la cantidad de pares
	 @Test
	 public void testOddNumbers() {
		amount = counter.getOddOcurrences();
	 	assertEquals(amount, 9);
	 }
	 
	 // Verifica la cantidad de multiplos de 3
	 @Test
	 public void testMultiplesOf3() {
		amount = counter.getMultiplesOcurrencesOf(3);
	 	assertEquals(amount, 2);
	 }
	 
	// Verifica la cantidad de multiplos de 2
		 @Test
		 public void testMultiplesOf2() {
			amount = counter.getMultiplesOcurrencesOf(2);
		 	assertEquals(amount, 1);
		 }
	 
	 
	 
}
