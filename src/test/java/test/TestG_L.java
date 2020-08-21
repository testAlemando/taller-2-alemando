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
public class TestG_L {
	static Respuesta res = new Respuesta();

	@Test
   	public void testG(){
	   String mensaje = "Recuerda que los atributos que hacen referencia a objetos son aquellos que estan definidos como Clases,\n los String tambien son objetos";
	   assertEquals(res.preguntaG, "b", mensaje);
   	}
    
	@Test
   	public void testH(){
	   String mensaje = "Recuerda que el valor por defecto de un variable que hace referencia a un objeto es null";
	   assertEquals(res.preguntaH, "c", mensaje);
   	}
	
	@Test
   	public void testI(){
        String mensaje = "El nombre es un atributo de tipo no primitivo su valor por defecto sera null";
        assertEquals(res.preguntaI, "c", mensaje);
    }
     
    @Test
   	public void testJ(){
	   String mensaje = "Recuerda que el valor por defecto de un atributo entero es 0";
	   assertEquals(res.preguntaJ, 0, mensaje);
    }
     
    @Test
   	public void testK(){
	   String mensaje = "Revisa el valor por defecto que toma el atributo";
	   assertEquals(res.preguntaK, "a", mensaje);
    }

    @Test
   	public void testL(){
	   String mensaje = "Revisa la teoria sobre constantes";
	   assertEquals(res.preguntaL, "a", mensaje);
   	}
}