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

		Integrante ana = new Integrante("Ana", "Gomez", LocalDate.of(1995, 03, 11));
	}
   
   
    
	@Test
	void testPrintPromedioEdad() {
		
		
		equipo.agregarIntegrante(ana));
		
	    equipo.agregarIntegrante(new Integrante("Luis", "Martinez", LocalDate.of(1988, 10, 11)));
	    equipo.agregarIntegrante(new Integrante("Sofia", "Pérez", 30));
	    equipo.agregarIntegrante(new Integrante("Carlos", "Lopez", 41));
	    equipo.agregarIntegrante(new Integrante("Valeria", "Fernandez", 35));
    		String salidaEsperada = "El promedio de edad es: 34\n";
        assertEquals(salidaEsperada, equipo.getPromedioEtarioIntegrantes());
	}

}
