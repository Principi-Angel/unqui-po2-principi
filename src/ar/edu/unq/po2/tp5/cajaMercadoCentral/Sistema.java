package ar.edu.unq.po2.tp5.cajaMercadoCentral;

import java.util.ArrayList;

public class Sistema { 
	
	public void registrarProductos(Cliente cliente) {
		float montoTotal = 0;
		for(ProductoTradicional producto : cliente.productos()) {
			if(producto.tieneStock()) {
				montoTotal += producto.getPrecio();
				producto.decrementarStock();
			}
		}
		cliente.setMontoAPagar(montoTotal);
	}
}
