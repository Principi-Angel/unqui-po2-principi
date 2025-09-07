package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> ns = new ArrayList();

	public Counter() {
		super();
	}
	
	public void addNumber(Integer n) {
		ns.add(n);
	}
	
	public int getEvenOcurrences() {
		int total = 0;
		for(int n : ns) {
			if(n % 2 == 0) { total++; }	
		}
		return total;
	}
	
	public int getOddOcurrences() {
		int total = 0;
		for(int n : ns) {
			if(n % 2 != 0) { total++; }	
		}
		return total;
	}
	
	public int getMultiplesOcurrencesOf(Integer n) {
		int total = 0;
	    for(int i = 0; i < ns.size(); i++) {
	        if (ns.get(i) % n == 0) {
	            total++;
	        }
	    }
	    return total;
	}
	
	/**
	 * @param numbers es un arreglo de Integer.
	 * @return -1 si no hay número con al menos un digito par o el primer número con más digitos pares,
	 * del arreglo. 
	 */
	public Integer getNumbWithMostEvensWithIn(ArrayList<Integer> numbers) { 
		int maxOcurrencesCount = 0;
		int result = -1;

        for (int number : numbers) {
            int evenCount = countEvens(number);
            if (evenCount > maxOcurrencesCount) {
            		maxOcurrencesCount = evenCount;
                result = number;
            }
        }
        return result;
    }

    private int countEvens(int number) {
        int count = 0;
        int auxN = Math.abs(number); 

        while (auxN > 1) {
            int digit = auxN % 10;
            if (digit % 2 == 0) {
                count++;
            }
            auxN /= 10;
        }
        return count;
    }
    
    public int highestMultipleOf(int x, int y) {
    		if(x<1) {
    			throw new IllegalArgumentException( x + "es menor que 1.");
    		}
    		
    		if(y<1) {
    			throw new IllegalArgumentException( y + "es menor que 1.");
    		}
    		
    		int result = -1;
    		
    		for(int i = 1000; i >= 1; i--) {
    			if (i % x == 0 && i % y == 0) {
                 return i;
             }
    		}
    		
    		return result;
    }
    
    
}