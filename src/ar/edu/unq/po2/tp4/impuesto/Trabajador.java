package ar.edu.unq.po2.tp4.impuesto;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public float getTotalPercibido() {
		float total = 0;
		for(Ingreso ingreso : ingresos) {
			total += ingreso.getMonto();
		}
		return total;
	}
	
	public float getMontoImponible() {
		float montoImponible = 0;
		for(Ingreso ingreso : ingresos) {
			if(ingreso.getEsImponible()) {
				montoImponible += ingreso.getMonto();
			}
		}
		return montoImponible;
	}
	 
	public float getImpuestoAPagar() {
		return 0.02f * this.getMontoImponible();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
}
