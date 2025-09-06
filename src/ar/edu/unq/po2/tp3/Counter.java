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
}