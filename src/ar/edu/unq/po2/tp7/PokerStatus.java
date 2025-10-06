package ar.edu.unq.po2.tp7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ar.edu.unq.po2.tp7pokerStatus.Carta.Carta;
import ar.edu.unq.po2.tp7pokerStatus.Carta.Valor;

public class PokerStatus {

	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		Carta[] cartas = {c1, c2, c3, c4, c5};
		
		Map<Valor, Long> conteoValores = Arrays.stream(cartas)
	            .collect(Collectors.groupingBy(Carta::getValor, Collectors.counting()));
		
		int contador = conteoValores.size();
		
		if(contador==3) {
			return "Trio";
		}
		
		if(contador==4) {
			return "Poker";
		}
		
		boolean todasMismoPalo = Arrays.stream(cartas)
				.allMatch(carta -> carta.mismoPaloQue(cartas[0]));
		
		if(todasMismoPalo) {
			return "Color";
		}
		
		return "Nada";
	}
	
}
