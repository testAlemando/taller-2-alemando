package test;

import taller2.Respuesta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestA_F {
	static Respuesta res = new Respuesta();

	@Test
   	public void testA(){
	   String mensaje = "Hay algo malo";
	   
	   if(res.preguntaA<3) {
		   mensaje = "Te falto contar unas clases";
	   }
	   if(res.preguntaA>3) {
		   mensaje = "Te pasaste unas cuantas clases";
	   }
	   assertEquals(res.preguntaA, 3, mensaje);
    }
	
	@Test
   	public void testB(){
	   String mensaje = "Para identificar en cual clase se encuentra el programa principal,\n debes buscar aquella que tenga un metodo con el nombre main";
	   assertEquals(res.preguntaB, "c", mensaje);
   	}
	
	@Test
   	public void testC(){
	   String mensaje = "Hay algo malo";
	   
	   if(res.preguntaC <3) {
		   mensaje = "Contaste el hijo?, el resultado del metodo procrear";
	   }
	   assertEquals(res.preguntaC, 3, mensaje);
     }
     
     @Test
   	public void testD(){
	   String mensaje = "Revisa los nombres de las variables donde se crean los objetos de tipo animal,\n incluso en los metodos que ejecuta";
	   assertEquals(res.preguntaD, "b", mensaje);
     }
     
     @Test
   	public void testE(){
	   String mensaje = "Recuerda que los atributos son aquellos que se definen inmediatamente despues de darle nombre a una clase";
	   assertEquals(res.preguntaE, "a", mensaje);
     }

     @Test
   	public void testF(){
	   String mensaje = "Recuerda que los tipos primitivos son aquellos que no tienen asociado un objeto,\n como (int, long, double, etc.)";
	   assertEquals(res.preguntaF, "a", mensaje);
     }

}