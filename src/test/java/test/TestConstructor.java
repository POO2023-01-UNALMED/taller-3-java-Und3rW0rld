package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import taller3.televisores.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestConstructor {
	
	@Test
   	public void testContador(){
		
		TV.setNumTV(0);
		
		Marca marca =  new Marca("Semsung");
	   
		TV tv1 =  new TV(marca, true);
		TV tv2 =  new TV(marca, true);
		TV tv3 =  new TV(marca, true);
	   
	   assertEquals(TV.getNumTV(), 3, "No estas contando el numero de objetos de tipo de TV que se van creando");
    }
	
	@Test
   	public void testConstructorMarca(){
		
		TV.setNumTV(0);
		
		Marca marca =  new Marca("Semsung");
	   
	   assertEquals(marca.getNombre(), "Semsung", "Hay un problema con el construcor de Marca");
    }
	
	@Test
   	public void testConstructorTV(){
		
		TV.setNumTV(0);
		
		Marca marca =  new Marca("Xiomi");
	   
		TV tv1 =  new TV(marca, true);
		
		boolean ok = false;
		if(tv1.getMarca().getNombre().equals("Xiomi") && tv1.getEstado()) {
			ok = true;
		}
	   assertTrue(ok, "Hay un problema con el construcor de TV");
    }
	
	@Test
   	public void testValoresDefecto(){
		
		Marca marca =  new Marca("Xiomi");
	   
		TV tv1 =  new TV(marca, true);
		
		boolean ok = false;
		if(tv1.getPrecio() == 500 && tv1.getCanal() == 1 && tv1.getVolumen() == 1) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con los valores por defecto de la clase TV");
    }

}
