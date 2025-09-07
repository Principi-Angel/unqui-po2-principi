package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {
	private Counter counter;
	int amount;
	ArrayList<Integer> arrayIntegerTest;
	 
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
		 arrayIntegerTest = new ArrayList<Integer>();
		 arrayIntegerTest.clear();
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
	
	// Verifica el número con mayor digitos pares
	@Test
	public void testEvenDigits() {
		arrayIntegerTest.add(24800245);
		arrayIntegerTest.add(2599553);
		arrayIntegerTest.add(22228844);
		arrayIntegerTest.add(22228222);
		arrayIntegerTest.add(351975130);
		amount = counter.getNumbWithMostEvensWithIn(arrayIntegerTest);
		assertEquals(amount, 22228844);
	}
	
	// Verifica el número con mayor digitos pares
	@Test
	public void testArrayWithOutAnyEvenDigit() {
		arrayIntegerTest.add(11111555);
		arrayIntegerTest.add(3379);
		arrayIntegerTest.add(99555731);
		arrayIntegerTest.add(1);
		arrayIntegerTest.add(3519751);
		amount = counter.getNumbWithMostEvensWithIn(arrayIntegerTest);
		assertEquals(amount, -1);
	}
	
	@Test
	public void testHighestMultipleOf5And2() {
		amount = 1000;
		assertEquals(amount, counter.highestMultipleOf(5, 2));
	}
	
	@Test
	public void testHighestMultipleOf3And9() {
		amount = 999;
		assertEquals(amount, counter.highestMultipleOf(3, 9));
	}
	
	@Test
	public void testHighestMultipleOf991And501() {
		amount = -1;
		assertEquals(amount, counter.highestMultipleOf(991, 501));
	}
	
	@Test
	public void testHighestMultipleOf500And1000() {
		amount = 1000;
		assertEquals(amount, counter.highestMultipleOf(500, 1000));
	}
	
	@Test
	public void throwsException_highestMultipleOf() {
		assertThrows(RuntimeException.class, () -> counter.highestMultipleOf(100, -1));
	}
	
	
	
	
	 
	 
	 
}
