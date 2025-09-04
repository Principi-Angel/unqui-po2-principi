package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

public class ReciboHaberes {
	private String nombreEmpleado;
    private String direccion;
    private LocalDate fechaEmision;
    private float sueldoBruto;
    private float sueldoNeto;
    private String conceptos;
	
    public ReciboHaberes(String nombreEmpleado, String direccion, LocalDate fechaEmision, float sueldoBruto, float sueldoNeto,
    		String conceptos) {
        this.nombreEmpleado = nombreEmpleado;
        this.direccion = direccion;
        this.fechaEmision = fechaEmision;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
        this.conceptos = conceptos;
    }

    public String desgloce() {
    	return  "Nombre: " + nombreEmpleado + 
                "Dirección: " + direccion   + 
                "Fecha: " + fechaEmision +
                "Sueldo Bruto: " + sueldoBruto +
                "Sueldo Neto: " + sueldoNeto +
                "Conceptos: " + conceptos
                ;
    }
}
