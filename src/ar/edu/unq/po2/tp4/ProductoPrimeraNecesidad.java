package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private int descuento = 10;

	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado, int descuento) {
		this(nombre, precio, esPrecioCuidado);
		this.descuento  = descuento;
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() - this.getMontoDescuento();
	}
	
	private Double getMontoDescuento() {
		return (super.getPrecio() * descuento)/100;
	}
}
