package ar.edu.unq.po2.tp2;
import java.util.ArrayList;
import java.util.List;


public class Empresa {
	    private String nombre;
	    private String cuit;
	    private List<Empleado> empleados = new ArrayList<>();
	    private List<ReciboHaberes> recibos = new ArrayList<>();
	    
	    public Empresa(String nombre, String cuit) {
	        this.nombre = nombre;
	        this.cuit = cuit;
	    }

	    public void agregarEmpleado(Empleado e) {
	        empleados.add(e);
	    }

	    public float totalSueldosNetos() {
	    	float total = 0;
	    	for(Empleado currentEmpleado : empleados) {
	    		total = total + currentEmpleado.sueldoNeto();
	    	}
	        return total;
	    }

	    public float totalSueldosBrutos() {
	    	float total = 0;
	    	for(Empleado currentEmpleado : empleados) {
	    		total = total + currentEmpleado.sueldoBruto();
	    	}
	        return total;
	    }

	    public float totalRetenciones() {
	    	float total = 0;
	    	for(Empleado currentEmpleado : empleados) {
	    		total = total + currentEmpleado.montoRetenciones();
	    	}
	        return total;
	    }

	    public void liquidarSueldos() {
	        for (Empleado e : empleados) {
	            e.generarRecibo(this);
	        }
	    }
	    
	    public void recibirRecibo(ReciboHaberes recibo) {
	    	recibos.add(recibo);
	    }
}