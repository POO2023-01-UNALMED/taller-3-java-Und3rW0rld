package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
public class TestMetodos {
	
	@Test
   	public void testMetodoCanal(){
		
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setCanal(100);
		tv1.canalDown();
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.setCanal(50);
		control.turnOn();
		control.canalUp();
		
		TV tv3 =  new TV(marca, false);
		tv2.setCanal(121);
		
		boolean ok = false;
		
		if(tv1.getCanal() == 99 && tv2.getCanal() == 2 && tv3.getCanal() == 1) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con los metodos y restricciones del cambio de canales del televisor");
    }
	
	@Test
   	public void testMetodoVolumen(){
		
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setVolumen(5);
		tv1.volumenUp();
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.turnOn();
		control.volumenUp();
		
		TV tv3 =  new TV(marca, true);
		tv3.setVolumen(7);
		tv3.volumenUp();
		
		boolean ok = false;
		
		if(tv1.getVolumen() == 6 && tv2.getVolumen() == 2 && tv3.getVolumen() == 7) {
			ok = true;
		}
		assertTrue(ok, "Hay un problema con los metodos y restricciones del cambio de volumen del televisor");
    }
	
	@Test
   	public void testMetodoEstado(){
		
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, false);
		
		tv1.turnOff();
	   
	   assertFalse(tv1.getEstado(), "Hay un problema con el cambio de estado del televisor");
    }
	
	

}
