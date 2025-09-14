package ar.edu.unq.po2.tp5.cajaMercadoCentral;
import java.util.ArrayList;

public class Cliente {
	ArrayList<ProductoTradicional> productos = new ArrayList<ProductoTradicional>();
	private Double montoAPagar = 0d;
	
	public void agregarProducto(ProductoTradicional producto) {
		productos.add(producto);
	}
	
	public void registrarProductos(Sistema sistema) {
		sistema.registrarProductos(this);
	}
	
	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	public ArrayList<ProductoTradicional> productos(){
		return productos;
	}
	
	public void registrarProductos() { 
		for(ProductoTradicional producto : productos) {
			producto.registrar(this);
		}
	}
	
	public void sumarMontoProducto(Double montoProducto) {
		montoAPagar += montoProducto;
	}
	
}
