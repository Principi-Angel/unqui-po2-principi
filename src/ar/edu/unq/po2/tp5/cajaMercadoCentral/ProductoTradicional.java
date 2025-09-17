package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class ProductoTradicional implements Item {
	private Double valor;
	private int stock;
	
	public ProductoTradicional(Double valor, int stock) {
		this.valor = valor;	
		this.stock = stock;
	}
	
	public Double getValor() {
		return valor;
	}
	
	protected boolean tieneStock() {
		return stock > 0;
	}
		
	@Override
	public void registrar() {
		if(this.tieneStock()) {
			stock--;
		} 
	}	
}
