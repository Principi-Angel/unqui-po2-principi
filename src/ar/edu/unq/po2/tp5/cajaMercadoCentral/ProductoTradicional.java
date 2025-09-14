package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class ProductoTradicional {
	private float precio;
	private int stock;
	
	public ProductoTradicional(float precio, int stock) {
		this.precio = precio;	
		this.stock = stock;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public boolean tieneStock() {
		return stock > 1;
	}
	
	public void decrementarStock() {
		stock--;
	}
}
