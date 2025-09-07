package unq;

import static org.junit.jupiter.api.Assertions.*;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.EquipoDeTrabajo.Integrante;

class EquipoDeTrabajoTest {
	EquipoDeTrabajo equipo = new EquipoDeTrabajo("PO2-UNQ");
	

	@BeforeEach
	void setUp() throws Exception {

		Integrante ana = equipo.new Integrante("Ana", "Gomez", LocalDate.of(1995, 03, 11)); 
		equipo.agregarIntegrante(ana); // 30 años
		
		Integrante luis = equipo.new Integrante("Luis", "Martinez", LocalDate.of(1988, 10, 11) );
		equipo.agregarIntegrante(luis); // 36 años
		
		Integrante carlos = equipo.new Integrante("Carlos", "Gonzalez",LocalDate.of(1984, 05, 11));
	    equipo.agregarIntegrante(carlos); // 41 años
	    
		Integrante valeria = equipo.new Integrante("Valeria", "Fernandez", LocalDate.of(1989, 11, 5));
	    equipo.agregarIntegrante(valeria); // 35 años
	    
	    	Integrante sofia = equipo.new Integrante("Sofia", "Perez", LocalDate.of(1995, 11, 3));
		equipo.agregarIntegrante(sofia); // 29 años
	  
	}
   
   
    
	@Test
	void testPrintPromedioEdad() {
    		String salidaEsperada = "El promedio de edad es: 34.2";
    		String salidaObtenida =  "El promedio de edad es: " + equipo.getPromedioEtarioIntegrantes();
        assertEquals(salidaEsperada, salidaObtenida);
	}

}
