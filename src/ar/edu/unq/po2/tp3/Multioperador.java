package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
		
    public int sumar(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public int restar(ArrayList<Integer> numeros) {
    		int resta = 0;
    		for (int numero : numeros) {
    			resta -= numero;
    		}
        return resta;
    }

    public int multiplicar(ArrayList<Integer> numeros) {
    		if(numeros.isEmpty()) { throw new IllegalArgumentException( "lista vacía." ); }
        int producto = 1;
        for (int numero : numeros) {
            producto *= numero;
        }
        return producto;
    }
}
