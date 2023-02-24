package test;

import taller3.televisores.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestThis {

	@Test
   	public void testEnlazar(){
	   Marca marca =  new Marca("Semsung");
	   
	   TV tv =  new TV(marca, true);
	   Control control =  new Control();
	   
	   control.enlazar(tv);
	   
	   assertNotEquals(tv.getControl(), null, "revisa el metodo enlazar y la asignacion de el objeto control en el televisor");
    }
	
	@Test
   	public void testEnlazarControl(){
	   Marca marca =  new Marca("Semsung");
	   
	   TV tv =  new TV(marca, true);
	   Control control =  new Control();
	   
	   control.enlazar(tv);
	   
	   assertNotEquals(control.getTv(), null, "revisa el metodo enlazar y la asignacion de el objeto televisor en el control");
    }

}