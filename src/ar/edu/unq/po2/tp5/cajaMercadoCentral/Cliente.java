package ar.edu.unq.po2.tp5.cajaMercadoCentral;
import java.util.ArrayList;

public class Cliente {
	ArrayList<ProductoTradicional> productos = new ArrayList<ProductoTradicional>();
	private float montoAPagar = 0;
	
	public void agregarProducto(ProductoTradicional producto) {
		productos.add(producto);
	}
	
	public void registrarProductos(Sistema sistema) {
		sistema.registrarProductos(this);
	}
	
	public void setMontoAPagar(float montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	public float getMontoAPagar() {
		return montoAPagar;
	}
	
	public ArrayList<ProductoTradicional> productos(){
		return productos;
	}

}
