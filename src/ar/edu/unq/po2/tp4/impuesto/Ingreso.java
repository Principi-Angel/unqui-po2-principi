package ar.edu.unq.po2.tp4.impuesto;

public class Ingreso {
	private int mesPercepcion;
	private	String concepto;
	private float monto;
	
	public Ingreso(int mesPercepcion, String concepto, float monto) {
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}

	public float getMonto() {
		return monto;
	}

	public boolean getEsImponible() {
		return true;
	}
}
