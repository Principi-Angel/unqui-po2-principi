package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class ProductoTradicional {
	private Double precio;
	private int stock;
	
	public ProductoTradicional(Double precio, int stock) {
		this.precio = precio;	
		this.stock = stock;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	protected boolean tieneStock() {
		return stock > 0;
	}
		
	public void registrar(Cliente cliente) {
		if(this.tieneStock()) {
			cliente.sumarMontoProducto(this.getPrecio());
			stock--;
		} else {
			cliente.sumarMontoProducto(0d);
		}
	}	
}
