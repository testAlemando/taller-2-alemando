package test;

import taller2.Respuesta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestM_P {
	static Respuesta res = new Respuesta();

	@Test
   	public void testM(){
	   String mensaje = "Revisa el codigo por que algunos metodos dejarian de funcionar";
	   assertFalse(res.preguntaM, mensaje);
   	}
    
	@Test
   	public void testN(){
	   String mensaje = "Recuerda el valor inicial de los atributos primitivos";
	   assertTrue(res.preguntaN, mensaje);
   	}
	
	@Test
   	public void testO(){
        String mensaje = "Hay algo malo";
 	   
 	   if(res.preguntaA<4) {
 		   mensaje = "Te falto contar unos metodos";
 	   }
 	   if(res.preguntaA>4) {
 		   mensaje = "Te pasaste unos cuantos metodos";
 	   }
        assertEquals(res.preguntaO, 4, mensaje);
    }
     
    @Test
   	public void testP(){
	   String mensaje = "Te recomiendo leer un poco acerca de como funcionan las variables para los objetos";
	   assertEquals(res.preguntaP, "b", mensaje);
    }
     
}