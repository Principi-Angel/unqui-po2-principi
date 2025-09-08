package ar.edu.unq.po2.tp4.impuesto;

public class IngresoPorHoraExtra extends Ingreso {
	private float cantidadHorasExtras;

	public IngresoPorHoraExtra(int mesPercepcion, String concepto, float monto, float cantidadHorasExtras) {
		super(mesPercepcion, concepto, monto);
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	@Override
	public boolean getEsImponible() {
		return false;
	}
	
	@Override
	public float getMonto() {
		return super.getMonto() * cantidadHorasExtras;
	}
	
	public float getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}
}
