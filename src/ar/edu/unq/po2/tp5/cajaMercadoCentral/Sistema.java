package ar.edu.unq.po2.tp5.cajaMercadoCentral;

import java.util.ArrayList;

public class Sistema { 
	ArrayList<Item> items = new ArrayList<Item>();

	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public void registrarProductos(Cliente cliente) {
		Double montoAPagar = 0d;
		for(Item item : items) {
			montoAPagar += item.getValor();
			item.registrar();
		}
		cliente.pagarMonto(montoAPagar);
	}
}
