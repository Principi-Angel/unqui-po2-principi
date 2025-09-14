package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class ProductoCooperativa extends ProductoTradicional {
	public Double descuento = 10d;

	public ProductoCooperativa(Double precio, int stock) {
		super(precio, stock);
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio() * ((100d-descuento)/100d);
	}
}
