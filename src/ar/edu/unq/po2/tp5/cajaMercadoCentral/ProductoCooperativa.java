package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class ProductoCooperativa extends ProductoTradicional {
	public float descuento = 0.10f;

	public ProductoCooperativa(float precio, int stock) {
		super(precio, stock);
	}

	@Override
	public float getPrecio() {
		return super.getPrecio() * (1 - descuento);
	}
}
