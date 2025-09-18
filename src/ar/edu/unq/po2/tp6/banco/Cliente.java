package ar.edu.unq.po2.tp6.banco;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private Double sueldoNetoMensual;
	private Banco banco;
	private Propiedad propiedad;
	private Double saldoEnCuenta;
	
	public Double getSueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}
	
	public Double getSueldoMensual() {
		return sueldoNetoMensual;
	}

	public Propiedad garantia() {
		return propiedad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void recibir(Double monto) {
		saldoEnCuenta += monto;
	}
	
	public Double getSaldoEnCuenta() {
		return saldoEnCuenta;
	}
}